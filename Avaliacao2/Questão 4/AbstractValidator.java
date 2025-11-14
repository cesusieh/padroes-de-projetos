import java.util.concurrent.*;

public abstract class AbstractValidator implements Validator {
    protected Validator next;
    private final long timeoutMillis;

    public AbstractValidator(long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }

    @Override
    public void setNext(Validator next) {
        this.next = next;
    }

    @Override
    public void validate(ValidationContext context) {
        if (context.isChainHalted()) {
            return;
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Boolean> future = executor.submit(() -> {
            return performValidation(context);
        });

        try {
            boolean success = future.get(this.timeoutMillis, TimeUnit.MILLISECONDS);
            if (success) {
                if (this instanceof DatabaseValidator) {
                    context.getRollbackStack().push(this);
                }
                if (next != null) {
                    next.validate(context);
                }
            }
        } catch (TimeoutException e) {
            System.out.println("!!! ERRO: " + this.getClass().getSimpleName() + " excedeu o timeout de " + timeoutMillis + "ms.");
            context.addError(this.getClass().getSimpleName() + " - Timeout");
            context.setChainHalted(true);
        } catch (Exception e) {
            context.addError(this.getClass().getSimpleName() + " - Erro inesperado: " + e.getMessage());
            context.setChainHalted(true);
        } finally {
            executor.shutdownNow();
        }
    }

    protected abstract boolean performValidation(ValidationContext context);

    @Override
    public void rollback(ValidationContext context) {
    }
}
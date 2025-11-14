import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidationContext {
    private final FiscalDocument document;
    private final List<String> errors = new ArrayList<>();
    private int failureCount = 0;
    private boolean isChainHalted = false;
    private final Stack<Validator> rollbackStack = new Stack<>();

    public ValidationContext(FiscalDocument document) {
        this.document = document;
    }

    public FiscalDocument getDocument() { return document; }
    public List<String> getErrors() { return errors; }
    public Stack<Validator> getRollbackStack() { return rollbackStack; }

    public void addError(String error) {
        this.errors.add(error);
        this.failureCount++;
        if (this.failureCount >= 3) {
            System.out.println("!!! CIRCUIT BREAKER ATIVADO: 3 falhas detectadas. Interrompendo a cadeia. !!!");
            this.isChainHalted = true;
        }
    }

    public boolean isChainHalted() {
        return isChainHalted;
    }

    public void setChainHalted(boolean isChainHalted) {
        this.isChainHalted = isChainHalted;
    }

    public boolean isValid() {
        return errors.isEmpty();
    }
}
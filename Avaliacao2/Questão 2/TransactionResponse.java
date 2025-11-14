// TransactionResponse.java
public class TransactionResponse {
    private final boolean success;
    private final String message;

    public TransactionResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "TransactionResponse{" +
                "sucesso=" + success +
                ", mensagem='" + message + '\'' +
                '}';
    }
}
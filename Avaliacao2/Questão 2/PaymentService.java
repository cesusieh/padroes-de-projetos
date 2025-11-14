// PaymentService.java

public class PaymentService {

    private final TransactionProcessor processor;

    public PaymentService(TransactionProcessor processor) {
        this.processor = processor;
    }

    public void processSampleTransactions() {
        System.out.println("Realizando primeira transação (BRL)");
        TransactionResponse response1 = processor.authorize("1111-2222-3333-4444", 250.50, "BRL");
        System.out.println("[CLIENTE] Resposta recebida: " + response1);

        System.out.println("Realizando segunda transação (USD)");
        TransactionResponse response2 = processor.authorize("9999-8888-7777-6666", 99.99, "USD");
        System.out.println("[CLIENTE] Resposta recebida: " + response2);

        System.out.println("Realizando segunda transação (USD)");
        TransactionResponse response3 = processor.authorize("3333-6666-9999-1111", 120.50, "EUR");
        System.out.println("[CLIENTE] Resposta recebida: " + response3);
    }
}
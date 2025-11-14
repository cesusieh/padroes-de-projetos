// TransactionProcessor.java
public interface TransactionProcessor {
    TransactionResponse authorize(String card, double value, String currency);
}
// BankingSystemAdapter.java
import java.util.HashMap;

public class BankingSystemAdapter implements TransactionProcessor {

    private final LegacyBankingSystem legacySystem;

    public BankingSystemAdapter(LegacyBankingSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public TransactionResponse authorize(String card, double value, String currency) {
        System.out.println("[ADAPTADOR] Recebendo chamada moderna. Traduzindo para o sistema legado...");

        HashMap<String, Object> legacyParameters = new HashMap<>();
        legacyParameters.put("card_number", card);
        legacyParameters.put("total_value", value);

        int currencyCode = convertCurrencyToCode(currency);
        legacyParameters.put("currency_code", currencyCode);

        legacyParameters.put("terminal_id", "TERM-MODERNO-01");

        HashMap<String, Object> legacyResponse = legacySystem.processTransaction(legacyParameters);

        System.out.println("[ADAPTADOR] Recebendo resposta do legado. Traduzindo para o formato moderno...");
        return convertLegacyResponse(legacyResponse);
    }

    private int convertCurrencyToCode(String currency) {
        switch (currency.toUpperCase()) {
            case "USD":
                return 1;
            case "EUR":
                return 2;
            case "BRL":
                return 3;
            default:
                return 0;
        }
    }

    private TransactionResponse convertLegacyResponse(HashMap<String, Object> legacyResponse) {
        int statusCode = (int) legacyResponse.get("status_code");
        String message = (String) legacyResponse.get("return_msg");

        boolean success = (statusCode == 200);
        return new TransactionResponse(success, message);
    }
}

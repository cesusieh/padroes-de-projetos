// LegacyBankingSystem.java
import java.util.HashMap;

public class LegacyBankingSystem {

    public HashMap<String, Object> processTransaction(HashMap<String, Object> parameters) {
        System.out.println("\n[SISTEMA LEGADO] Recebendo transação para processamento.");
        System.out.println("[SISTEMA LEGADO] Parâmetros recebidos: " + parameters);

        HashMap<String, Object> response = new HashMap<>();

        if (!parameters.containsKey("terminal_id")) {
            System.out.println("[SISTEMA LEGADO] ERRO: Campo obrigatório 'terminal_id' não encontrado.");
            response.put("status_code", 400);
            response.put("return_msg", "FALHA NA VALIDACAO DE DADOS");
            return response;
        }

        String card = (String) parameters.get("card_number");
        double value = (double) parameters.get("total_value");
        int currency = (int) parameters.get("currency_code");

        if (card != null && value > 0 && currency > 0) {
            System.out.println("[SISTEMA LEGADO] Transação processada com sucesso.");
            response.put("status_code", 200);
            response.put("return_msg", "APROVADA");
        } else {
            System.out.println("[SISTEMA LEGADO] ERRO: Dados inválidos para processamento.");
            response.put("status_code", 500);
            response.put("return_msg", "ERRO INTERNO");
        }

        return response;
    }
}
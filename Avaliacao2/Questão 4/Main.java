// Para esse problema foi usado o padrão Chain of Responsibility
// Ele resolve o problema pois os passos de validação dependem um do outro, o que dificultaria a implementação usando if/else.

// Lógica
// Ele permite desacoplamento, pois o cliente da cadeia (a classe Main) não precisa conhecer os validadores individuais, apenas o Orquestrador (ValidationChainOrchestrator) que inicia o processo.
// // Cada elo da corrente não precisa saber sobre outros elos, apenas sobre o próximo
// Facilita a manutenção, cada elo da corrente é uma classe separada, para criar uma nova validação, basta criar uma nova classe Validator e incluir ela dentro do Orchestrator
// sem precisar modificar as classes já existentes
// Cada classe de validação tem uma responsabilidade única, isso permite deixar o código limpo a fácil de manter


public class Main {
    public static void main(String[] args) {
        ValidationChainOrchestrator orchestrator = new ValidationChainOrchestrator();

        FiscalDocument successDoc = new FiscalDocument("<schemaValido>", "VALIDO", 100.0, 54321);
        ValidationContext result1 = orchestrator.execute(successDoc);
        System.out.println("Resultado Final (Sucesso): Válido? " + result1.isValid() + ", Erros: " + result1.getErrors());
        System.out.println("Documento foi persistido? " + successDoc.wasPersistedInDb());

        System.out.println("\n================================================\n");

        FiscalDocument rollbackDoc = new FiscalDocument("<schemaValido>", "VALIDO", 100.0, 99999);
        System.out.println("Estado do Documento ANTES: Persistido? " + rollbackDoc.wasPersistedInDb());
        ValidationContext result2 = orchestrator.execute(rollbackDoc);
        System.out.println("Resultado Final (Rollback): Válido? " + result2.isValid() + ", Erros: " + result2.getErrors());
        System.out.println("Estado do Documento DEPOIS: Persistido? " + rollbackDoc.wasPersistedInDb());

        System.out.println("\n================================================\n");

        FiscalDocument earlyFailDoc = new FiscalDocument("<schemaValido>", "INVALIDO", 100.0, 11111);
        ValidationContext result3 = orchestrator.execute(earlyFailDoc);
        System.out.println("Resultado Final (Falha Cedo): Válido? " + result3.isValid() + ", Erros: " + result3.getErrors());
    }
}
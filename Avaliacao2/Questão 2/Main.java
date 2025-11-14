// Main.java

// Para este problema foi escolhido o padrão adapter
// O padrão adapter consegue resolver esse problema sem precisar modificar o código legado, e preservando a manutenabilidade do novo sistema
// Ele faz isso adaptando as saídas do sistema legado antes que elas cheguem no sistema novo, fazendo com que os 2 sistemas possam conversar sem dificuldades

// Lógica
// Protegemos o sistema legado (LegacyBankingSystem)
// Promovemos um baixo acoplamento, o nosso client (PaymentService) não precisa saber nada sobre o sistema legado, dependendo apenas da interface TransactionProvider
// Isso significa, que caso o sistema legado venha a ser subtituido, o nosso PaymentService não vai ser afetado
// Toda a lógica de conversação entre eles fica contido em BankingSystemAdapter, previnindo poluição no código do PaymentService

public class Main {
    public static void main(String[] args) {
        LegacyBankingSystem legacySystem = new LegacyBankingSystem();
        TransactionProcessor processor = new BankingSystemAdapter(legacySystem);
        PaymentService paymentService = new PaymentService(processor);

        paymentService.processSampleTransactions();
    }
}
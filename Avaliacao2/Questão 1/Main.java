// Main.java

// Foi escolhido o padrão strategy pois ele resolve nosso problema encapsulando os algoritmos de cálculo
// Isso permite anular a necessidade de criar If's/Switch que poderiam aumentar a complexidade do código e dificultar a manutenção
// Para criar um novo algoritmo, é necessário apenas que ele implemente a interface RiskMetric e tudo deverá funcionar bem

// Caso não seguissemos essa abordagem, seria necessário escrever um novo bloco de if/switch para cada vez que um novo algoritmo fosse criado

// Lógica
// O nosso objeto principal (RiskAnalysisEngine) pode alterar seu comportamento baseado no algoritmo recebido.
// Para isso, implementamos uma interface RiskMetric, que espera receber um context, com isso, nossa engine não precisa saber os detalhes do objeto recebido
// Isso permite que ela chame o método calculateRisk() independente dos detalhes do objeto recebido

public class Main {
    public static void main(String[] args) {
        FinancialContext context = new FinancialContext(1000000.0, 0.95, 10, "Aumento da taxa de juros");
        RiskAnalysisEngine engine = new RiskAnalysisEngine();

        System.out.println("\nTrocando para a estratégia Value at Risk");
        engine.setRiskMetric(new ValueAtRisk());
        engine.performAnalysis(context);

        System.out.println("\nTrocando para a estratégia Expected Shortfall");
        engine.setRiskMetric(new ExpectedShortfall());
        engine.performAnalysis(context);

        System.out.println("\nTrocando para a estratégia Stress Testing");
        engine.setRiskMetric(new StressTesting());
        engine.performAnalysis(context);
    }
}
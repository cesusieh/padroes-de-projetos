public class RiskAnalyzer {
    private RiskCalculationStrategy strategy;

    public void setRiskCalculationStrategy(RiskCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void analyze(Client client) {
        if (strategy == null) {
            System.out.println("No risk calculation strategy has been set.");
            return;
        }
        String profile = strategy.calculate(client);
        System.out.println(profile);
    }
}
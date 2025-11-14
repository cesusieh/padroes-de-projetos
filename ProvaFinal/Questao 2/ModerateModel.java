public class ModerateModel implements RiskCalculationStrategy {
    @Override
    public String calculate(Client client) {
        return "Risk Profile MODERATE calculated for " + client.getName() + ". Balance between safety and profitability.";
    }
}
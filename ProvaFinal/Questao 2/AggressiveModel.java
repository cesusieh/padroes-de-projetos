public class AggressiveModel implements RiskCalculationStrategy {
    @Override
    public String calculate(Client client) {
        return "Risk Profile AGGRESSIVE calculated for " + client.getName() + ". Focus on high profitability.";
    }
}
public class ConservativeModel implements RiskCalculationStrategy {
    @Override
    public String calculate(Client client) {
        return "Risk Profile CONSERVATIVE calculated for " + client.getName() + ". Focus on capital preservation.";
    }
}
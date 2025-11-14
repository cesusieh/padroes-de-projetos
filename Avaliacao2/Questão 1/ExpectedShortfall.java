// ExpectedShortfall.java
public class ExpectedShortfall implements RiskMetric {
    @Override
    public void calculateRisk(FinancialContext context) {
        System.out.println("Calculando Expected Shortfall (ES): Média das perdas que excedem o valor do VaR.");
    }
}
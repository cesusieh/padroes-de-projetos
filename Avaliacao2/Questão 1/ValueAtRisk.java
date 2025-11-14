// ValueAtRisk.java
public class ValueAtRisk implements RiskMetric {
    @Override
    public void calculateRisk(FinancialContext context) {
        System.out.println("Calculando Value at Risk (VaR): Perda potencial máxima em um determinado horizonte de tempo com um nível de confiança de " + context.getConfidenceLevel() * 100 + "%.");
    }
}
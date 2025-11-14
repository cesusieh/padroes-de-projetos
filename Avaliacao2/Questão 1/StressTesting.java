// StressTesting.java
public class StressTesting implements RiskMetric {
    @Override
    public void calculateRisk(FinancialContext context) {
        System.out.println("Executando Stress Testing: Analisando o impacto do cenário de mercado '" + context.getMarketScenario() + "' no portfólio.");
    }
}
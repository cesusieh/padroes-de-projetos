// RiskAnalysisEngine.java
public class RiskAnalysisEngine {
    private RiskMetric riskMetric;

    public void setRiskMetric(RiskMetric riskMetric) {
        this.riskMetric = riskMetric;
    }

    public void performAnalysis(FinancialContext context) {
        if (riskMetric == null) {
            System.out.println("Por favor, defina um algoritmo de cálculo de risco primeiro.");
            return;
        }
        riskMetric.calculateRisk(context);
    }
}
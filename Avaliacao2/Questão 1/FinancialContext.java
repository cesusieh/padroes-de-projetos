// FinancialContext.java
public class FinancialContext {
    private double portfolioValue;
    private double confidenceLevel;
    private double timeHorizonDays;
    private String marketScenario;

    public FinancialContext(double portfolioValue, double confidenceLevel, double timeHorizonDays, String marketScenario) {
        this.portfolioValue = portfolioValue;
        this.confidenceLevel = confidenceLevel;
        this.timeHorizonDays = timeHorizonDays;
        this.marketScenario = marketScenario;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public double getConfidenceLevel() {
        return confidenceLevel;
    }

    public double getTimeHorizonDays() {
        return timeHorizonDays;
    }

    public String getMarketScenario() {
        return marketScenario;
    }
}
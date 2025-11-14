
public class WeeklyReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating Weekly Report...");
        System.out.println("Data Source: Consolidated Data Warehouse");
        System.out.println("Metrics: Weekly KPIs, route performance, costs");
        System.out.println("Format: Interactive HTML Dashboard");
        System.out.println("------------------------------------");
    }
}
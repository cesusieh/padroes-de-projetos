
public class DailyReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating Daily Report...");
        System.out.println("Data Source: Operational Database");
        System.out.println("Metrics: Daily operations, delivery status");
        System.out.println("Format: Simplified PDF");
        System.out.println("------------------------------------");
    }
}
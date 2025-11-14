public class DailyReportFabric extends ReportFabric {
    @Override
    public Report createReport() {
        return new DailyReport();
    }
}
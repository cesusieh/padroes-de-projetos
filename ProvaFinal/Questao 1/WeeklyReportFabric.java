public class WeeklyReportFabric extends ReportFabric {
    @Override
    public Report createReport() {
        return new WeeklyReport();
    }
}
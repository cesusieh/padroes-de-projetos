public abstract class ReportFabric {
    public abstract Report createReport();

    public void processAndGenerateReport() {
        Report report = createReport();
        report.generate();
    }
}
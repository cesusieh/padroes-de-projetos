// Para resolver esse problema foi usado Factory Method
// Ele permite encapsular as classes e abstrair a lógica de criação nos factorys. 
// Com isso, a main não precisa saber a lógica dentro das classes, passando toda a responsabilidade para as factorys

// Facilita a extensão, para criar um novo report é necessário apenas criar uma classe que implemente Report e factory que extenda ReportFabric

public class Main {
    public static void main(String[] args) {
        ReportFabric dailyReportFabric = new DailyReportFabric();
        dailyReportFabric.processAndGenerateReport();

        ReportFabric weeklyReportFabric = new WeeklyReportFabric();
        weeklyReportFabric.processAndGenerateReport();
    }
}
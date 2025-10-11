// O pattern decorator permite estender funcionalidades do RelatorioBasico o código já escrito. Garante flexibilidade e evita a necessidade criar diversas classes semelhantes.
public class Main {
    public static void main(String[] args) {
        Reporte reporteCompleto = new RelatorioBasico(); 
        reporteCompleto = new EstatisticasDecorator(reporteCompleto); 
        reporteCompleto = new GraficoDecorator(reporteCompleto);      
        reporteCompleto = new ExportacaoPDFDecorator(reporteCompleto);
        
        System.out.println(reporteCompleto.gerarConteudo());
    }
}

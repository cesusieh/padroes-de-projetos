// Classe abstrata responsavel por definir o contrato para novos decoradores de relatorio.
abstract class RelatorioDecorator implements Reporte {
    protected Reporte reporteDecorado;

    public RelatorioDecorator(Reporte reporteDecorado) {
        this.reporteDecorado = reporteDecorado;
    }
    @Override
    public String gerarConteudo() {
        return reporteDecorado.gerarConteudo();
    }
}
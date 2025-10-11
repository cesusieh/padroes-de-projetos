class ExportacaoPDFDecorator extends RelatorioDecorator {
    public ExportacaoPDFDecorator(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String gerarConteudo() {
        String conteudoBasico = super.gerarConteudo();
        String exportacao = adicionarExportacaoPDF();
        return conteudoBasico + exportacao;
    }

    private String adicionarExportacaoPDF() {
        return "Exportando em PDF";
    }
}

class EstatisticasDecorator extends RelatorioDecorator {
    public EstatisticasDecorator(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String gerarConteudo() {
        String conteudoBasico = super.gerarConteudo();
        String estatisticas = adicionarEstatisticas();
        return conteudoBasico + estatisticas;
    }

    private String adicionarEstatisticas() {
        return "Gerando relatório com estatísticas\n";
    }
}
class GraficoDecorator extends RelatorioDecorator {
    public GraficoDecorator(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String gerarConteudo() {
        String conteudoBasico = super.gerarConteudo();
        String grafico = adicionarGrafico();
        return conteudoBasico + grafico;
    }

    private String adicionarGrafico() {
        // Lógica simulada para gerar (ou referenciar) o gráfico
        return "Gerando relatório com gráficos\n";
    }
}
// Contem a funcionalidade principal de gerar relatorio.
class RelatorioBasico implements Reporte {
    public RelatorioBasico() {
    }

    @Override
    public String gerarConteudo() {
        return "Gerando relatório básico\n";
    }
}
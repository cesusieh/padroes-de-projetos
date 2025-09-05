package Pagamentos;
public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    private boolean validarNumeroCartao(){
        return numeroCartao.length() == 16;
    }

    @Override
    public String processarPagamento(double valor) {
        return validarNumeroCartao() ? "Pagamento de " + valor + " aprovado" : "Pagamento de " + valor + " negado";
    }
}

package Factorys;
import Pagamentos.IPagamento;
import Pagamentos.PagamentoCartaoCredito;

public class FactoryCartaoCredito extends IFactoryPagamento {
    private String numeroCartao;

    public FactoryCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCartaoCredito(numeroCartao);
    }
}
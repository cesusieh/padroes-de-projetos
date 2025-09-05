package Factorys;
import Pagamentos.IPagamento;
import Pagamentos.PagamentoApplePay;

public class FactoryApplePay extends IFactoryPagamento {
    private double saldo;

    public FactoryApplePay(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoApplePay(saldo);
    }
}
package Factorys;
import Pagamentos.IPagamento;
import Pagamentos.PagamentoCripto;

public class FactoryCripto extends IFactoryPagamento {
    private double saldo;

    public FactoryCripto(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoCripto(saldo);
    }
}
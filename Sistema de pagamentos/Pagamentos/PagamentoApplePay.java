package Pagamentos;

public class PagamentoApplePay implements IPagamento {
    private double saldo;

    public PagamentoApplePay(double saldo) {
        this.saldo = saldo;
    }

    private boolean validarSaldo(double valor){
        return saldo >= valor;
    }
    
    @Override
    public String processarPagamento(double valor) {
        return validarSaldo(valor) ? "Pagamento de " + valor + " aprovado" : "Pagamento de " + valor + " negado";
    }
}

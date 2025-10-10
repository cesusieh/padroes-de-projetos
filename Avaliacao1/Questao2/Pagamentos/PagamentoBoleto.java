package Pagamentos;

public class PagamentoBoleto implements IPagamento {

    public PagamentoBoleto(){};

    @Override
    public String processarPagamento() {
        return "boleto";
    }
}

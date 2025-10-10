package Pagamentos;

public class PagamentoCartao implements IPagamento {
    
    public PagamentoCartao(){};

    @Override
    public String processarPagamento() {
        return "cartão";
    }
}

package Pagamentos;

public class PagamentoPix implements IPagamento{
    
    public PagamentoPix(){};

    @Override
    public String processarPagamento() {
        return "pix";
    }
}

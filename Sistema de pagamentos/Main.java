import Factorys.*;

public class Main {
    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        service.processarPagamento(new FactoryCartaoCredito("1231231231231230"), 250);
        service.processarPagamento(new FactoryPayPal("teste@gmail.com"), 250);
        service.processarPagamento(new FactoryCripto(500), 250);
        
        service.processarPagamento(new FactoryCartaoCredito("123123123123123"), 250);
        service.processarPagamento(new FactoryCripto(100), 250);
    }
}

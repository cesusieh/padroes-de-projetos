import Factorys.IFactoryPagamento;

public class PagamentoService {
    public PagamentoService(){};

    public void processarPagamento(IFactoryPagamento factory, double valor) {
        System.out.println(factory.criarPagamento().processarPagamento(valor));
    }
}

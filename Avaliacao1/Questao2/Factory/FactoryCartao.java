package Factory;

import Pagamentos.IPagamento;
import Pagamentos.PagamentoCartao;

public class FactoryCartao implements IFactory {
    public FactoryCartao(){};
    
    @Override
    public IPagamento gerarProcessador() {
        return new PagamentoCartao();
    }
}

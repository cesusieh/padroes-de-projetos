package Factory;

import Pagamentos.IPagamento;
import Pagamentos.PagamentoBoleto;

public class FactoryBoleto implements IFactory {
    public FactoryBoleto(){};
    
    @Override
    public IPagamento gerarProcessador() {
        return new PagamentoBoleto();
    }
}

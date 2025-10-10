package Factory;

import Pagamentos.IPagamento;
import Pagamentos.PagamentoPix;

public class FactoryPix implements IFactory {
    
    public FactoryPix(){};

    @Override
    public IPagamento gerarProcessador() {
        return new PagamentoPix();
    }
}

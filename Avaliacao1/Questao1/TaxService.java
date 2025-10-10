import Factorys.IFactoryTransporte;

public class TaxService {
    public TaxService(){};

    public void processPay(IFactoryTransporte f, double v) {
        System.out.println(f.criarTransporte().calcularTarifa(v));
    }
}

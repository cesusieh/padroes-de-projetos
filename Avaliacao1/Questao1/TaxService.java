import Factorys.IFactoryTransporte;

public class TaxService {
    public TaxService(){};

    public void processPay(IFactoryTransporte f, double v) {
        System.out.println("Valor: R$"+v + ". Valor da taxa: R$" + f.criarTransporte().calcularTarifa(v)+".");
    }
}

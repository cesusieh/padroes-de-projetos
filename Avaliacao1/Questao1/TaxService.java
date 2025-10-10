import Factorys.IFactoryTransporte;

// Implementa um consumer com o método processPay, capaz de lidar com qualquer fábrica criada a partir de IFactory.
public class TaxService {
    public TaxService(){};

    public void processPay(IFactoryTransporte f, double v) {
        System.out.println("Valor: R$"+v + ". Valor da taxa: R$" + f.criarTransporte().calcularTarifa(v)+".");
    }
}

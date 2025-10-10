import Factorys.FactoryAereo;
import Factorys.FactoryTerrestre;
import Factorys.FactoryMaritimo;


public class Main {
    public static void main(String[] args) {
        TaxService service = new TaxService();

        service.processPay(new FactoryTerrestre(50), 50);
        service.processPay(new FactoryAereo(30), 80);
        service.processPay(new FactoryMaritimo(100), 30);
    }
}
import Factorys.FactoryAereo;
import Factorys.FactoryTerrestre;
import Factorys.FactoryMaritimo;

// O código implementa um Factory method, capaz de lidar com diferentes regras para o cálculo da tarifa sem que a lógica dentro de processPay() precise sofrer edições.
public class Main {
    public static void main(String[] args) {
        TaxService service = new TaxService();

        service.processPay(new FactoryTerrestre(50), 50);
        service.processPay(new FactoryAereo(30), 80);
        service.processPay(new FactoryMaritimo(100), 30);
    }
}
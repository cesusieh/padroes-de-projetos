import Factorys.FactoryTerrestre;

public class Main {
    public static void main(String[] args) {
        TaxService service = new TaxService();

        service.processPay(new FactoryTerrestre(50), 50);

    }
}
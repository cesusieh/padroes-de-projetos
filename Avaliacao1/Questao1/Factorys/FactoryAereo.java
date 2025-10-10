package Factorys;
import Transportes.ITransporte;
import Transportes.TransporteAereo;

public class FactoryAereo extends IFactoryTransporte {
    private double peso;

    public FactoryAereo(double peso) {
        this.peso = peso;
    }

    @Override
    public ITransporte criarTransporte() {
        return new TransporteAereo(peso);
    }

}
package Factorys;
import Transportes.ITransporte;
import Transportes.TransporteTerrestre;

public class FactoryTerrestre extends IFactoryTransporte {
    private double distancia;

    public FactoryTerrestre(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public ITransporte criarTransporte() {
        return new TransporteTerrestre(distancia);
    }

}
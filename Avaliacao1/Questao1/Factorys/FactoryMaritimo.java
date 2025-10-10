package Factorys;
import Transportes.ITransporte;
import Transportes.TransporteMaritimo;

public class FactoryMaritimo extends IFactoryTransporte {
    private double rainChance;

    public FactoryMaritimo(double rainChance) {
        this.rainChance = rainChance;
    }

    @Override
    public ITransporte criarTransporte() {
        return new TransporteMaritimo(rainChance);
    }

}
package Transportes;
public class TransporteMaritimo implements ITransporte {
    private double rainChance;

    public TransporteMaritimo(double rain){
        this.rainChance = rain;
    }

    @Override
    public double calcularTarifa(double valor) {
        return (rainChance / 100) * 50;
    }
}
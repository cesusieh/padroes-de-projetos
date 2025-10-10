package Transportes;
public class TransporteTerrestre implements ITransporte {
    private double distancia;

    public TransporteTerrestre(double distancia){
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa(double valor) {
        return (valor * 0.01) * distancia;
    }
}
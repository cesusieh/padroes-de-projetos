package Transportes;
public class TransporteAereo implements ITransporte {
    private double peso;

    public TransporteAereo(double peso){
        this.peso = peso;
    }

    @Override
    public double calcularTarifa(double valor) {
        return (peso / 10) * 30;
    }
}
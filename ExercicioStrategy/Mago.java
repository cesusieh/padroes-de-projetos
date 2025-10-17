public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 70, 150, 5, 7, 18);
    }

    protected boolean podeUsarTipoDeArma(Arma arma) {
        return (arma instanceof CajadoArcano);
    }
    
}
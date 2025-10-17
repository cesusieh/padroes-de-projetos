public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 90, 80, 8, 15, 7);
    }

    protected boolean podeUsarTipoDeArma(Arma arma) {
        return (arma instanceof ArcoElfico);
    }
    
}
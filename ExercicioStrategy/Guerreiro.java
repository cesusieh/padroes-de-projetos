public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 120, 50, 15, 8, 5);
    }

    protected boolean podeUsarTipoDeArma(Arma arma) {
        return (arma instanceof EspadaLonga);
    }
    
}
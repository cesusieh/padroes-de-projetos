public class CajadoArcano implements Arma {

    public String getNome() { 
        return "Cajado Arcano"; 
    }

    public int getDanoBase() { 
        return 8; 
    }

    public int getCustoMana() { 
        return 25; 
    }

    public boolean podeEquipar(Personagem personagem) {
        return personagem.getInteligencia() >= 12;
    }

    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " conjura " + getNome() + " em " + alvo.getNome() + ".");

        alvo.receberDano(getDanoBase());
    }
}
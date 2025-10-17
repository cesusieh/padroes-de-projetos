public class ArcoElfico implements Arma {

    public String getNome() { 
        return "Arco Élfico"; 
    }

    public int getDanoBase() { 
        return 12; 
    }

    public int getCustoMana() { 
        return 15; 
    }

    public boolean podeEquipar(Personagem personagem) {
        return personagem.getDestreza() >= 8;
    }

    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " dispara " + getNome() + " contra " + alvo.getNome() + ".");

        alvo.receberDano(getDanoBase());
    }
}
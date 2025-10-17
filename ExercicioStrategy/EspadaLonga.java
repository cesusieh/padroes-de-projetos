public class EspadaLonga implements Arma {

    public String getNome() { 
        return "Espada Longa"; 
    }
    
    public int getDanoBase() { 
        return 15; 
    }
    
    public int getCustoMana() { 
        return 0; 
    }

    public boolean podeEquipar(Personagem personagem) {
        return personagem.getForca() >= 10;
    }

    public void atacar(Personagem atacante, Personagem alvo) {
        System.out.println(atacante.getNome() + " ataca " + alvo.getNome() + " com a " + getNome() + ".");
        
        alvo.receberDano(getDanoBase());
    }
}
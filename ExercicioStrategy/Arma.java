public interface Arma {
    
    String getNome();
    int getDanoBase();
    int getCustoMana();

    boolean podeEquipar(Personagem personagem);

    void atacar(Personagem atacante, Personagem alvo);
}
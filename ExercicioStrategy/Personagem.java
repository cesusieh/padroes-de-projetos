public abstract class Personagem {

    protected String nome;
    protected int vida;
    protected int mana;
    protected int forca;
    protected int destreza;
    protected int inteligencia;

    protected Arma armaEquipada;

    public Personagem(String nome, int vida, int mana, int forca, int destreza, int inteligencia) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.armaEquipada = null;
    }

    public void equiparArma(Arma novaArma) {
        
        if (!this.podeUsarTipoDeArma(novaArma)) {
            System.out.println(this.nome + " não sabe manusear o tipo de arma " + novaArma.getNome() + ".");
            return;
        }

        if (!novaArma.podeEquipar(this)) {
            System.out.println(this.nome + " não cumpre os requisitos de atributos para " + novaArma.getNome() + ".");
            return;
        }

        this.armaEquipada = novaArma;
        System.out.println(this.nome + " equipou " + novaArma.getNome() + ".");
    }

    public void atacar(Personagem alvo) {
        if (this.armaEquipada == null) {
            System.out.println(this.nome + " está desarmado e não pode atacar!");
            return;
        }

        int custoMana = this.armaEquipada.getCustoMana();
        if (this.mana < custoMana) {
            System.out.println(this.nome + " não tem mana suficiente para usar " + this.armaEquipada.getNome() + ".");
            return;
        }

        this.mana -= custoMana;

        this.armaEquipada.atacar(this, alvo);
    }
    
    public void receberDano(int dano) {
        this.vida -= dano;
        System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);
        
        if (!this.estaVivo()) {
            System.out.println(this.nome + " foi derrotado!");
        }
    }

    protected abstract boolean podeUsarTipoDeArma(Arma arma);

    public int getForca() { return this.forca; }
    public int getDestreza() { return this.destreza; }
    public int getInteligencia() { return this.inteligencia; }
    public String getNome() { return this.nome; }
    public boolean estaVivo() { return this.vida > 0; }
    public void status() {
        System.out.println("Status: " + this.nome + " | HP: " + this.vida + " | MP: " + this.mana);
    }
}
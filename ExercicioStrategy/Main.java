public class Main {

    public static void main(String[] args) {
        
        System.out.println("### CRIANDO ARMAS (ESTRATÉGIAS) ###");
        Arma espada = new EspadaLonga();
        Arma arco = new ArcoElfico();
        Arma cajado = new CajadoArcano();

        System.out.println("\n### CRIANDO PERSONAGENS (CONTEXTOS) ###");
        Personagem garen = new Guerreiro("Garen");
        Personagem ashe = new Arqueiro("Ashe");
        Personagem ryze = new Mago("Ryze");

        System.out.println("\n### TESTANDO EQUIPAR ARMAS (TROCA DE ESTRATÉGIA) ###");
        
        garen.equiparArma(espada);
        garen.equiparArma(arco);

        ashe.equiparArma(arco);

        ryze.equiparArma(cajado);
        ryze.equiparArma(espada);

        System.out.println("\n### INÍCIO DA BATALHA (EXECUÇÃO DA ESTRATÉGIA) ###");
        garen.status();
        ashe.status();
        ryze.status();
        
        System.out.println("\n--- TURNO 1 ---");
        garen.atacar(ashe);
        ryze.atacar(garen);
        ashe.atacar(ryze);
        
        System.out.println("\n--- STATUS PÓS-TURNO 1 ---");
        garen.status();
        ashe.status();
        ryze.status();
        
        System.out.println("\n--- TURNO 2 (TESTE DE MANA) ---");
        ryze.atacar(garen);
        ryze.atacar(garen);
        ryze.atacar(garen);
        ryze.atacar(garen);
        ryze.atacar(garen);
        ryze.atacar(garen);
        
        System.out.println("\n--- STATUS FINAL ---");
        garen.status();
        ryze.status();
    }
}
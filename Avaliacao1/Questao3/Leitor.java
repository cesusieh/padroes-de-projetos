// Esse é o Observer. Possui um construtor que espera receber um Subject e realiza o Attach. Possui um método update() informando quando o subject receber alguma interação.
public class Leitor extends Observer {
    String name;

    public Leitor(String name, Topico topico){
        this.name = name;
        this.topico = topico;
        this.topico.attach(this);
    }

    @Override
    public void update() {
        System.out.println(this.name + " recebeu uma nova noticia: " + topico.buscarUltimaNoticia());
    }
}

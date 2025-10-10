// Foi usado o pattern Observer, ele permite que informar todas as partes interessadas nos tópicos sem precisar manter o controle manual de quem e como. Faz isso invertendo os papeis, o Subject apenas informa que houve alguma interação e na sequencia cada Observer interessado lida com isso de sua propria maneira a partir do método Update()
public class Main {
    public static void main(String[] args) {
        // Criando alguns tópicos de noticias
        Topico esportes = new Topico();
        Topico culinaria = new Topico();
        Topico seguranca = new Topico();

        // Criando leitores interessados nesses tópicos.
        Leitor leitorDeEsporte = new Leitor("Jorge", esportes);
        Leitor leitorDeCulinaria = new Leitor("Marcos", culinaria);
        Leitor leitorSeguranca = new Leitor("Felipe", seguranca);

        // Criandos algumas noticias para notificar os leitores
        esportes.adicionarNoticia("Noticia de esportes");
        culinaria.adicionarNoticia("Noticia de culinaria");
        seguranca.adicionarNoticia("Noticia de segurança");
    }
}

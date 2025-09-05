import java.time.LocalDate;

public class DigitalMedia extends LibraryItem {

    private String format;

    public DigitalMedia(String title, String author, LocalDate publicationDate, String format) {
        super(title, author, publicationDate);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void readInfos(){
        System.out.println("Título: " + getTitle());
        System.out.println("Autor/Criador: " + getAuthor());
        System.out.println("Ano de Publicação: " + getPublicationYear());
        System.out.println("Formato: " + getFormat());
    }

    public void play(){
        System.out.println("Tocando a mídia " + getTitle());
    }

    @Override
    public void borrow() {
        System.out.println("A mídia foi emprestada.");
    }

    @Override
    public void returnItem() {
        System.out.println("A mídia foi devolvida.");
    }
}
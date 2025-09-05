import java.time.LocalDate;

public class Book extends LibraryItem {

    private String genre;

    public Book(String title, String author, LocalDate publicationDate, String genre) {
        super(title, author, publicationDate);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void readInfos(){
        System.out.println("Título: " + getTitle());
        System.out.println("Autor/Criador: " + getAuthor());
        System.out.println("Ano de Publicação: " + getPublicationYear());
        System.out.println("Genêro: " + getGenre());
    }

    public void readSample() {
        System.out.println("Lendo uma amostra do livro: '" + getTitle() + "'.");
    }

    @Override
    public void borrow() {
        System.out.println("O livro foi emprestado.");
    }

    @Override
    public void returnItem() {
        System.out.println("O livro foi devolvido.");
    }
}
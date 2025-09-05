import java.time.LocalDate;

public class Magazine extends LibraryItem {

    private String issueNumber;

    public Magazine(String title, String author, LocalDate publicationDate, String issueNumber) {
        super(title, author, publicationDate);
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void readInfos(){
        System.out.println("Título: " + getTitle());
        System.out.println("Autor/Criador: " + getAuthor());
        System.out.println("Ano de Publicação: " + getPublicationYear());
        System.out.println("Edição: " + getIssueNumber());
    }

    @Override
    public void borrow() {
        System.out.println("A revista foi emprestada.");
    }

    @Override
    public void returnItem() {
        System.out.println("A revista foi devolvida.");
    }
}
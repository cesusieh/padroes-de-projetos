import java.time.LocalDate;

public abstract class LibraryItem implements Borrowable {
    private String title;
    private String author;
    private LocalDate publicationYear;

    public LibraryItem(String title, String author, LocalDate publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public abstract void readInfos();
}

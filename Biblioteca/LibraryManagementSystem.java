import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class LibraryManagementSystem {

    public static void main(String[] args) {
        Book book = new Book("O Senhor dos Anéis", "J.R.R. Tolkien", LocalDate.of(1954, 7, 29), "Fantasia");
        Magazine magazine = new Magazine("Superinteressante", "Editora Abril", LocalDate.of(2025, 9, 1), "480");
        DigitalMedia digitalMedia = new DigitalMedia("Documentário Planeta Terra II", "BBC", LocalDate.of(2016, 11, 6), "MP4");

        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(digitalMedia);
        for (LibraryItem item : libraryItems) {
            item.readInfos();
            item.borrow();
            item.returnItem();    
        }

        if (book instanceof Book) {
            book.readSample();
        }

        if (digitalMedia instanceof DigitalMedia) {
            digitalMedia.play();
        }
    }
}
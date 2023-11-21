import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    private List<Book> books;

    public BookDatabase() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    // Other methods...

    public List<Book> getBooks() {
        return books;
    }
}

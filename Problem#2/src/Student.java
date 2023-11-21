import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int id;
    private String email;
    private List<Book> bookList;

    {
        bookList = new ArrayList<>();
    }

    public Student(int id, String name) {
        super(name);
        this.id = id;
    }

    public Student(int id, String name, String surname) {
        super(name,surname);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void requesToBorrowBook(Book book){

        if(book.isAvailable()){
            bookList.add(book);
            book.setAvailable(false);
        }else{
            System.out.println("Book not available for borrowing.");
        }

    }



    public void ReturnBook(Book book){

        bookList.remove(book);
        book.setAvailable(true);
        
    }

    public List<Book> getBookList(){
        return this.bookList;
    }
}

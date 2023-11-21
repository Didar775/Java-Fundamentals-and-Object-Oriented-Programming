public class Librarian {
    public boolean processBorrowRequest(Student student, Book book) {
        if (book.isAvailable()) {
            student.requesToBorrowBook(book);
            return true;
        } else {
            System.out.println("Book not available for borrowing.");
            return false;
        }
    }
}

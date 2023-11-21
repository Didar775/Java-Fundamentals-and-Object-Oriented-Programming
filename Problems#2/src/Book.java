public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;
    private String genre;

    {
        available = true;
    }

    public Book(){};
    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    };

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public String getIsbn(){return this.isbn;}
    public boolean isAvailable(){
        return available;
    }

    public String toString(){
        return  "Author: " + this.author + "\nTitle: " + title + "\nGenre: " + this.genre;
    }


}

import java.util.HashSet;
import java.util.Set;

public class Book {
    String title;
    String isbn;
    String publisher;
    Set<Author>authors=new HashSet<>();
    public Book()
    {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    Book(String title, String isbn, String publisher)
    {
        this.title=title;
        this.isbn=isbn;
        this.publisher=publisher;
    }
    Book(String title, String isbn,String publisher,Set<Author>Authors)
    {
        this.title=title;
        this.isbn=isbn;
        this.publisher=publisher;
    }

}

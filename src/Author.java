import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;
 @Ent
public class Author {
    private String firstname;
    private String lastname;
    private Set<Book> books=new HashSet<>();
    Author()
    {

    }
    Author(String firstname, String lastname)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    Author(String firstname, String lastname, Set<Book>books)
    {
       this.firstname=firstname;
       this.lastname=lastname;
       this.books=books;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

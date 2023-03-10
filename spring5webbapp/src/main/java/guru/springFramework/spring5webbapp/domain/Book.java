package guru.springFramework.spring5webbapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String sbn;

    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    @JoinTable(name="author_book", joinColumns = @JoinColumn(name="book_id"),
            inverseJoinColumns = @JoinColumn(name= "author_id"))
    private Set<Author> authors = new HashSet<>();


    public Book() {
    }

    public Book(String title, String sbn) {
        this.title = title;
        this.sbn = sbn;

    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSbn() {
        return sbn;
    }

    public void setSbn(String sbn) {
        this.sbn = sbn;
    }

    public Set<Author> getAuthor() {
        return authors;
    }

    public void setAuthor(Set<Author> author) {
        this.authors = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sbn='" + sbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

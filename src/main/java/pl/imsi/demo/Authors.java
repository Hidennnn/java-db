package pl.imsi.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String name;

    @ManyToMany(mappedBy = "authors")
    private List<Books> books;

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Authors{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Authors(String name, List<Books> books) {
        this.name = name;
        this.books = books;
    }

    public Authors() {
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

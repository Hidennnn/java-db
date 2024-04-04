package pl.imsi.demo;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long genreId;

    private String name;

    @ManyToMany(mappedBy = "genres")
    private List<Books> books;

    public Genres(String name, List<Books> books) {
        this.name = name;
        this.books = books;
    }

    public Genres() {
    }

    @Override
    public String toString() {
        return "Genres{" +
                "genreId=" + genreId +
                ", name='" + name + '\'' +
                ", booksGenresList=" + books +
                '}';
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}


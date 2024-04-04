package pl.imsi.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Keywords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long keywordId;
    private String name;

    @ManyToMany(mappedBy = "keywords")
    private List<Books> books;

    public Keywords(String name, List<Books> books) {
        this.name = name;
        this.books = books;
    }

    public Keywords() {
    }

    @Override
    public String toString() {
        return "Keywords{" +
                "keywordId=" + keywordId +
                ", name='" + name + '\'' +
                ", booksKeywordsList=" + books +
                '}';
    }

    public Long getKeywordId() {
        return keywordId;
    }

    public void setKeywordId(Long keywordId) {
        this.keywordId = keywordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Books> getBooksKeywordsList() {
        return books;
    }

    public void setBooksKeywordsList(List<Books> books) {
        this.books = books;
    }
}

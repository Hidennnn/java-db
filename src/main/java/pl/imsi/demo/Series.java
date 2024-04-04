package pl.imsi.demo;

import jakarta.persistence.*;

@Entity
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seriesId;
    private String name;

    @OneToOne(mappedBy = "series", cascade = CascadeType.ALL)
    private Books books;

    @Override
    public String toString() {
        return "Series{" +
                "seriesId=" + seriesId +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Series() {
    }

    public Series(String name, Books books) {
        this.name = name;
        this.books = books;
    }
}

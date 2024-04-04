package pl.imsi.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String isbn;
    private String image;
    private String name;
    private String place;
    private int quantity;
    private int releaseDate;
    private int tome;

    @OneToOne()
    @JoinColumn(name="publisherId", foreignKey =
    @ForeignKey(name="FK_PublisherBooks"))
    private Publisher publisher;

    @OneToOne()
    @JoinColumn(name="seriesId", foreignKey =
            @ForeignKey(name="FK_SeriesBooks"))
    private Series series;

    @OneToMany(mappedBy = "books",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BooksUsers> booksUsersList;

    @ManyToMany
    @JoinTable(
            name = "books_genres",
            joinColumns = @JoinColumn(name="bookId"),
            inverseJoinColumns = @JoinColumn(name="genreId")
    )
    private List<Genres> genres;

    @ManyToMany
    @JoinTable(
            name = "books_authors",
            joinColumns = @JoinColumn(name="bookId"),
            inverseJoinColumns = @JoinColumn(name="authorId")
    )
    private List<Authors> authors;

    @ManyToMany
    @JoinTable(
            name = "books_keywords",
            joinColumns = @JoinColumn(name="bookId"),
            inverseJoinColumns = @JoinColumn(name="keywordId")
    )
    private List<Keywords> keywords;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTome() {
        return tome;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public List<BooksUsers> getBooksUsersList() {
        return booksUsersList;
    }

    public void setBooksUsersList(List<BooksUsers> booksUsersList) {
        this.booksUsersList = booksUsersList;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setBooksGenres(List<Genres> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", quantity=" + quantity +
                ", releaseDate=" + releaseDate +
                ", tome=" + tome +
                ", publisher=" + publisher +
                ", series=" + series +
                ", booksUsersList=" + booksUsersList +
                ", booksGenresList=" + genres +
                ", authors=" + authors +
                ", booksKeywordsList=" + keywords +
                '}';
    }

    public List<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    public Books(String isbn, String image, String name, String place, int quantity, int releaseDate, int tome, Publisher publisher, Series series, List<BooksUsers> booksUsersList, List<Genres> genres, List<Authors> authors, List<Keywords> keywords) {
        this.isbn = isbn;
        this.image = image;
        this.name = name;
        this.place = place;
        this.quantity = quantity;
        this.releaseDate = releaseDate;
        this.tome = tome;
        this.publisher = publisher;
        this.series = series;
        this.booksUsersList = booksUsersList;
        this.genres = genres;
        this.authors = authors;
        this.keywords = keywords;
    }

    public List<Keywords> getKeywords() {
        return keywords;
    }

    public void setBooksKeywordsList(List<Keywords> keywords) {
        this.keywords = keywords;
    }

    public Books() {
    }
}

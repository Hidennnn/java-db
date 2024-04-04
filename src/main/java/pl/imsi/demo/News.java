package pl.imsi.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long newsId;

    private Long bookId;
    private String image;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private LocalDate newsDate;

    private String text;
    private String title;

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", bookId=" + bookId +
                ", image='" + image + '\'' +
                ", newsDate=" + newsDate +
                ", text='" + text + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public News() {
    }

    public News(Long bookId, String image, LocalDate newsDate, String text, String title) {
        this.bookId = bookId;
        this.image = image;
        this.newsDate = newsDate;
        this.text = text;
        this.title = title;
    }
}


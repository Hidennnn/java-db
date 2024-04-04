package pl.imsi.demo;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BooksGenresId implements Serializable {
    private Long bookId;
    private Long genreId;
}

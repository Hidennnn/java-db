package pl.imsi.demo;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BooksAuthorsId implements Serializable {
    private Long bookId;
    private Long keywordId;
}

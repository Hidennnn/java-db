package pl.imsi.demo;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.time.LocalDate;

@Entity
public class BooksUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookUserId;

    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private LocalDate borrowDate;

    private char borrowed;
    private int fee;
    @DateTimeFormat(pattern = "DD-MM-YYYY")
    private LocalDate returnDate;

    @ManyToOne()
    @JoinColumn(name="bookId", foreignKey
            =@ForeignKey(name="FK_BooksBooksUser"))
    private Books books;

    @ManyToOne()
    @JoinColumn(name="userDataId", foreignKey
            =@ForeignKey(name="FK_UserDataBooksUser"))
    private UserData userUserDataId;

    @Override
    public String toString() {
        return "BooksUsers{" +
                "bookUserId=" + bookUserId +
                ", borrowDate=" + borrowDate +
                ", borrowed=" + borrowed +
                ", fee=" + fee +
                ", returnDate=" + returnDate +
                ", books=" + books +
                ", userUserDataId=" + userUserDataId +
                '}';
    }

    public Long getBookUserId() {
        return bookUserId;
    }

    public void setBookUserId(Long bookUserId) {
        this.bookUserId = bookUserId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public char getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(char borrowed) {
        this.borrowed = borrowed;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public UserData getUserUserDataId() {
        return userUserDataId;
    }

    public void setUserUserDataId(UserData userUserDataId) {
        this.userUserDataId = userUserDataId;
    }

    public BooksUsers() {
    }

    public BooksUsers(LocalDate borrowDate, char borrowed, int fee, LocalDate returnDate, Books books, UserData userUserDataId) {
        this.borrowDate = borrowDate;
        this.borrowed = borrowed;
        this.fee = fee;
        this.returnDate = returnDate;
        this.books = books;
        this.userUserDataId = userUserDataId;
    }
}

package pl.imsi.demo;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userDataId;
    private String icNumber;
    private String pesel;
    private String city;
    private String email;
    private String name;
    private Long phoneNumber;
    private String postalCode;
    private String street;
    private String surname;

    @OneToOne(mappedBy = "userDataUserDataId")
    private Accounts accounts;

    @OneToMany(mappedBy = "userUserDataId",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BooksUsers> booksUsersList;

    @Override
    public String toString() {
        return "UserData{" +
                "userDataId=" + userDataId +
                ", icNumber='" + icNumber + '\'' +
                ", pesel='" + pesel + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", surname='" + surname + '\'' +
                ", accounts=" + accounts +
                ", booksUsersList=" + booksUsersList +
                '}';
    }

    public Long getUserDataId() {
        return userDataId;
    }

    public void setUserDataId(Long userDataId) {
        this.userDataId = userDataId;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public List<BooksUsers> getBooksUsersList() {
        return booksUsersList;
    }

    public void setBooksUsersList(List<BooksUsers> booksUsersList) {
        this.booksUsersList = booksUsersList;
    }

    public UserData() {
    }

    public UserData(String icNumber, String pesel, String city, String email, String name, Long phoneNumber, String postalCode, String street, String surname, Accounts accounts, List<BooksUsers> booksUsersList) {
        this.icNumber = icNumber;
        this.pesel = pesel;
        this.city = city;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.postalCode = postalCode;
        this.street = street;
        this.surname = surname;
        this.accounts = accounts;
        this.booksUsersList = booksUsersList;
    }
}

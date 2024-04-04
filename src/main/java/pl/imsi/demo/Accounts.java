package pl.imsi.demo;

import jakarta.persistence.*;

@Entity
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private char enabled;
    private String login;
    private String password;
    private String role;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userDataId", foreignKey
            =@ForeignKey(name="FK_UserDataAccount"))
    private UserData userDataUserDataId;

    public Accounts(char enabled, String login, String password, String role, UserData userDataUserDataId) {
        this.enabled = enabled;
        this.login = login;
        this.password = password;
        this.role = role;
        this.userDataUserDataId = userDataUserDataId;
    }

    public Accounts() {

    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", enabled=" + enabled +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", userDataUserDataId=" + userDataUserDataId +
                '}';
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setEnabled(char enabled) {
        this.enabled = enabled;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUserDataUserDataId(UserData userDataUserDataId) {
        this.userDataUserDataId = userDataUserDataId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public char getEnabled() {
        return enabled;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public UserData getUserDataUserDataId() {
        return userDataUserDataId;
    }
}

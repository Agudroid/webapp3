package es.dawequipo3.growing.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    private String email;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String Surname;

    @Column(nullable = false)
    private String password;


    private String confirmPassword;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;



    public User(String email, String username, String password, String repeatPassword, String... roles) {
        super();
        this.email = email;
        this.userName = username;
        if (password.equals(repeatPassword))
        this.password = password;
        this.roles = List.of(roles);
    }

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }


    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


}

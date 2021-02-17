package business;

import java.io.Serializable;

/**
 *
 * @author dev
 */
public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.username = "";
        this.password = "";
    }

    public User(String firstName, String lastName, String emailAddress, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailAddress;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

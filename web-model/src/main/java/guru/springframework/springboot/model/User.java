package guru.springframework.springboot.model;

/**
 * @Project mb2g-spring-boot
 * Created by @Author Parinit on 4/26/2020
 * at 3:23 PM
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;

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
}

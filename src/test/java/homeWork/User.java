package homeWork;

public class User {
    private  String genderChoose;
    private  String name;
    private  String lastname;
    private  String email;
    private  String password;

    public void setGenderChoose(String genderChoose) {
        this.genderChoose = genderChoose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenderChoose() {
        return genderChoose;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

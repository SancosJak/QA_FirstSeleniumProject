package com.demoshop.models;

public class User {
    private  String genderChoose;
    private  String name;
    private  String lastname;
    private  String email;
    private  String password;

    public User setGenderChoose(String genderChoose) {
        this.genderChoose = genderChoose;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
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

    @Override
    public String toString() {
        return "User{" +
                "genderChoose='" + genderChoose + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

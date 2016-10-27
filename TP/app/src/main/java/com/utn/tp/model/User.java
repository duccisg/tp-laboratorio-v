package com.utn.tp.model;

/**
 * Created by sebastian.g.ducci on 10/16/2016.
 */
public class User {

    private String name;
    private String lastName;
    private String userName;
    private String password;
    private String password2;

    public User() {
    }

    public User(String name, String lastName, String userName, String password, String password2) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.password2 = password2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}

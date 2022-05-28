package com.example.finalproject;

public class Users {
    private String id;
    private String name;
    private String number;
    private String password;

    public Users() {
    }

    public Users(String id, String name, String number, String password) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.example.androideatingapp;

public class User {

    private String Name, Pass;

    public User() { /*use to get value with firebase*/ }
    public User(String name, String pass) {
        Name = name;
        Pass = pass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Pass;
    }

    public void setPassword(String password) {
        Pass = password;
    }
}

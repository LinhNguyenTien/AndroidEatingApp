package com.example.androideatingapp;

public class Category {

    private String Name;
    private String Image;

    public Category(String name, String iamge) {
        Name = name;
        Image = iamge;
    }

    public Category() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return Image;
    }

    public void setIamge(String iamge) {
        Image = iamge;
    }
}

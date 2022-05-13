package com.example.finalproject.RecykelViewUserConterg;

import java.io.Serializable;

public class ClassShowPrice implements Serializable {
    private String name;
    private int image;
    private String price;

    public ClassShowPrice(String name, int image, String price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

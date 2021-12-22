package com.techmeskills.lesson5.task1;

public class Trousers {
    ClothSize trousersSize;
    String color;


    public Trousers(ClothSize trousersSize, String color) {
        this.trousersSize = trousersSize;
        this.color = color;
    }

    public ClothSize getSize() {
        return trousersSize;
    }

    public String getColor() {
        return color;
    }

    public void setSize(ClothSize trousersSize) {
        this.trousersSize = trousersSize;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

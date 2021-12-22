package com.techmeskills.lesson5.task1;

public class TShirt {
    ClothSize trousersSize;
    String color;
    String tShirtPrint;

    public TShirt(ClothSize trousersSize, String color, String tShirtPrint) {
        this.trousersSize = trousersSize;
        this.color = color;
        this.tShirtPrint = tShirtPrint;
    }

    public ClothSize getSize() {
        return trousersSize;
    }

    public String getColor() {
        return color;
    }

    public String getPrint() {
        return tShirtPrint;
    }

    public void setSize(ClothSize trousersSize) {
        this.trousersSize = trousersSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrint(String tShirtPrint) {
        this.tShirtPrint = tShirtPrint;
    }
}

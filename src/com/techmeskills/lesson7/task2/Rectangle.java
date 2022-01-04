package com.techmeskills.lesson7.task2;

public class Rectangle extends Shape {
    private int coordinateA;
    private int coordinateB;
    private int coordinateC;
    private int coordinateD;

    public Rectangle(String color, int coordinateA, int coordinateB, int coordinateC, int coordinateD) {
        super(color);
        this.coordinateA = coordinateA;
        this.coordinateB = coordinateB;
        this.coordinateC = coordinateC;
        this.coordinateD = coordinateD;
    }

    @Override
    void draw() {

    }
}

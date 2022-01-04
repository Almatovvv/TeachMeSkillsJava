package com.techmeskills.lesson7.task2;

import java.util.Objects;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract void draw();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    public String getColor() {
        return color;
    }
}

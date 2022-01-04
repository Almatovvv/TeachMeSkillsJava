package com.techmeskills.lesson7.task1;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super.food = food;
        super.location = location;
    }

    private String horseNoise = "И-го-го";

    @Override
    void makeNoise() {
        System.out.println("Лошадка - " + horseNoise);
    }

    @Override
    void eat() {
        System.out.println("Лошадка ест");
    }
}

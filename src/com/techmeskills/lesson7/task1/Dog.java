package com.techmeskills.lesson7.task1;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super.food = food;
        super.location = location;
    }

    private String dogNoise = "Гав-гав";

    @Override
    void makeNoise() {
        System.out.println("Собака - " + dogNoise);
    }

    @Override
    void eat() {
        System.out.println("Собака ест");
    }
}

package com.techmeskills.lesson7.task1;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super.food = food;
        super.location = location;
    }

    private String catNoise = "Мяу-мяу";

    @Override
    void makeNoise() {
        System.out.println("Кошка - " + catNoise);
    }

    @Override
    void eat() {
        System.out.println("Кошка ест");
    }
}

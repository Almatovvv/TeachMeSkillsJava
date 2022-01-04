package com.techmeskills.lesson7.task1;

public class Vet {

    void treatAnimal(Animal animal) {
        System.out.println("Питание животного " + animal.getClass().getSimpleName() + " - " + animal.food);
        System.out.println("Локация животного " + animal.getClass().getSimpleName() + " - " + animal.location);
    }
}

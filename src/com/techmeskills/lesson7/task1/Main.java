package com.techmeskills.lesson7.task1;

public class Main {
    public static void main(String[] args) {
        //Создаем животных и ветеринара
        Animal kitty = new Cat("Mouse", "Home");
        Animal dog = new Dog("Humans food and trash", "Home and outdoors");
        Animal horse = new Horse("Meat", "Outdoors");
        Vet vet = new Vet();
        String test;

        //Создаем массив животных
        Animal[] animalList = {kitty, dog, horse};

        //Цикл лечения животных
        for (Animal el : animalList) {
            vet.treatAnimal(el);
        }

//        test.get

    }
}

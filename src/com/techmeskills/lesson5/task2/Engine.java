package com.techmeskills.lesson5.task2;

import com.techmeskills.lesson5.task2.enums.EngineType;

public class Engine {
    double engineCapacity;
    int horsePower;
    EngineType engineType;

    public Engine(double engineCapacity, int horsePower, EngineType engineType) {
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.engineType = engineType;
    }

    public void increaseEngineSpeed() {
        System.out.println("Обороты двигателя увеличены");
    }

    public void decreaseEngineSpeed() {
        System.out.println("Обороты двигателя уменьшены");
    }
}

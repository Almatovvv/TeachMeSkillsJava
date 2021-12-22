package com.techmeskills.lesson5.task1;

import java.time.LocalDate;
import java.time.Period;

public class Human {
    String firstName;
    String surName;
    LocalDate dateOfBirth;
    int weight;
    String sex;
    TShirt tShirt;
    Trousers trousers;

    public Human(String firstName, String surName, LocalDate dateOfBirth, int weight, String sex, TShirt tShirt, Trousers trousers) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.sex = sex;
        this.tShirt = tShirt;
        this.trousers = trousers;
    }

    public void go() {
        System.out.println("Человек идет");
    }

    public void tellAge() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        System.out.println("Человеку " + period.getYears() + " лет");
    }

    public void tellAboutTShirt() {
        System.out.println("Размер футболки - " + tShirt.getSize() + ", цвет - " + tShirt.getColor() + " и надпись на футболке - " + tShirt.getPrint());
    }

    public void tellAboutTrousers() {
        System.out.println("Размер штанов - " + trousers.getSize() + ", цвет - " + trousers.getColor());
    }

    public void changeTShirt(TShirt tShirtToChange) {
        this.tShirt.setColor(tShirtToChange.getColor());
        this.tShirt.setSize(tShirtToChange.getSize());
        this.tShirt.setPrint(tShirtToChange.getPrint());
        System.out.println("Человек поменял футболку!");
    }

    public void changeTrousers(Trousers trousersToChange) {
        this.trousers.setColor(trousersToChange.getColor());
        this.trousers.setSize(trousersToChange.getSize());
        System.out.println("Человек поменял штаны!");
    }

}

package com.techmeskills.lesson5.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Создаем одежду
        TShirt tShirt1 = new TShirt(ClothSize.M, "Red", "Я бухаю на НГ!!!");
        TShirt tShirt2 = new TShirt(ClothSize.L, "Green", "Я за ЗОЖ!!!");
        Trousers trousers1 = new Trousers(ClothSize.XS, "Yellow");
        Trousers trousers2 = new Trousers(ClothSize.XL, "Purple");

        //Создаем человека и одеваем на него первый комплект одежды
        Human human1 = new Human("Полиндром", "Полиндромов", stringToDate("12.02.1993"), 88, "Муж", tShirt1, trousers1);

        //Человек идет,говорит о возрасте, говорит о штанах и о майке
        human1.go();
        human1.tellAge();
        human1.tellAboutTrousers();
        human1.tellAboutTShirt();

        //Переодеваем человека
        human1.changeTrousers(trousers2);
        human1.changeTShirt(tShirt2);

        //Человек говорит об обновленной одежде
        human1.tellAboutTrousers();
        human1.tellAboutTShirt();
    }

    static LocalDate stringToDate(String birthDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(birthDate, dtf);
    }
}

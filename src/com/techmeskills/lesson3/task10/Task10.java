package com.techmeskills.lesson3.task10;

import com.techmeskills.lesson3.lessonhelper.LessonHelper;

import java.util.Scanner;

public class Task10 {
    //Дано
    //Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
    //переменную n. Если пользователь ввёл не подходящее число, то программа
    //должна выдать соответствующее сообщение. Создать массив из n случайных
    //целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
    //только из чётных элементов первого массива, если они там есть, и вывести его
    //на экран.

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        int n = userInput();

        //Инициализация массива
        int[] arrayOne = lp.initializeArray(n);

        //Заполнение массивов случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, n);

        //Печать элементов массива
        lp.printArrayElementsHorizontally(arrayOne);

        int[] arrayTwo = lp.initializeArray(lp.countEvenNumbers(arrayOne));

        arrayTwo = fillArrayWithEvenNumbersFromOtherArray(arrayTwo,arrayOne);
        lp.printArrayElementsHorizontally(arrayTwo);
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число больше 3");
        int userInputValue = scanner.nextInt();
        while (userInputValue <= 3) {
            System.out.println("Было введено не положительное число, или число равно или меньше 3");
            userInputValue = scanner.nextInt();
        }
        return userInputValue;
    }

    public static int[] fillArrayWithEvenNumbersFromOtherArray(int[] arrayToFill, int[] arrayWithValues) {
        int arrayCounter = 0;
        for (int i = 0; i < arrayWithValues.length; i++) {
            if (arrayWithValues[i] % 2 == 0 && arrayWithValues[i] != 0) {
                arrayToFill[arrayCounter] = arrayWithValues[i];
                arrayCounter++;
            }
        }
        return arrayToFill;
    }
}

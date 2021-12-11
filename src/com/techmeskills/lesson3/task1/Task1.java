package com.techmeskills.lesson3.task1;

import com.techmeskills.lesson3.LessonHelper.LessonHelper;

import java.util.Arrays;

public class Task1 {
// Дано
// Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//созданием массива подумайте, какого он будет размера.

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        // Инициализация массива путем подсчета кол-ва четных чисел
        int[] array = lp.initializeArray(countEvenNumbers(20));

        // Заполнение массива четными числами
        array = fillArrayWithEvenNumbers(array);

        // Печать массива вертикально и горизонтально
        lp.printArrayElementsHorizontally(array);
        System.out.println();
        printArrayElementsVertically(array);
    }

    public static int countEvenNumbers(int countUntil) {
        int counter = 0;
        for (int i = 0; i <= countUntil; i++) {
            if (i % 2 == 0 && i != 0) counter++;
        }
        return counter;
    }

    public static int[] fillArrayWithEvenNumbers(int[] arrayToFill) {
        int arrayCounter = 0;
        for (int i = 0; i <= arrayToFill.length * 2; i++) {
            if (i % 2 == 0 && i != 0) {
                arrayToFill[arrayCounter] = i;
                arrayCounter++;
            }
        }
        return arrayToFill;
    }

    public static void printArrayElementsVertically(int[] arrayToPrint) {
        for (int el : arrayToPrint) {
            System.out.println(el);
        }
    }
}

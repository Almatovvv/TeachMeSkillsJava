package com.techmeskills.lesson3.task1;

import com.techmeskills.lesson3.lessonhelper.LessonHelper;

public class Task1 {
// Дано
// Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//созданием массива подумайте, какого он будет размера.

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        // Инициализация массива путем подсчета кол-ва четных чисел
        int[] array = lp.initializeArray(countEvenNumbers(2,20));

        // Заполнение массива четными числами
        array = fillArrayWithEvenNumbers(array);

        // Печать массива вертикально и горизонтально
        lp.printArrayElementsHorizontally(array);
        System.out.println();
        printArrayElementsVertically(array);
    }

    public static int countEvenNumbers(int countFrom, int countUntil) {
        int counter = 0;
        for (int i = countFrom; i <= countUntil; i++) {
            if (i % 2 == 0) counter++;
        }
        return counter;
    }

    public static int[] fillArrayWithEvenNumbers(int[] arrayToFill) {
        for (int i = 0, arrayCounter = 0; i <= arrayToFill.length * 2;) {
            i+=2;
            if (arrayCounter < arrayToFill.length) {
                arrayToFill[arrayCounter] = i;
            }
            arrayCounter++;
        }
        return arrayToFill;
    }

    public static void printArrayElementsVertically(int[] arrayToPrint) {
        for (int el : arrayToPrint) {
            System.out.println(el);
        }
    }
}

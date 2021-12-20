package com.techmeskills.lesson3.task2;

import com.techmeskills.lesson3.lessonhelper.LessonHelper;

public class Task2 {

    //Дано
    //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
    //строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
    //порядке (99 97 95 93 … 7 5 3 1).

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        // Инициализация массива путем подсчета кол-ва нечетных чисел
        int[] array = lp.initializeArray(lp.countOddNumbers(100));

        // Заполнение массива нечетными числами
        array = fillArrayWithOddNumbers(array);

        // Вывод массива в обычном и обратном порядке
        lp.printArrayElementsHorizontally(array);
        System.out.println();
        printArrayElementsBackwardsHorizontally(array);
    }

    public static int[] fillArrayWithOddNumbers(int[] arrayToFill) {
        int arrayCounter = 0;
        for (int i = 0; i <= arrayToFill.length * 2; i++) {
            if (i % 2 == 1) {
                arrayToFill[arrayCounter] = i;
                arrayCounter++;
            }
        }
        return arrayToFill;
    }

    public static void printArrayElementsBackwardsHorizontally(int[] arrayToPrint) {
        for (int i = arrayToPrint.length - 1; i >= 0; i--) {
            System.out.print(arrayToPrint[i] + " ");
        }
    }
}

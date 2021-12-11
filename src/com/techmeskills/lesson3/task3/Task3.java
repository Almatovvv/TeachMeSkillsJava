package com.techmeskills.lesson3.task3;

import com.techmeskills.lesson3.LessonHelper.LessonHelper;

public class Task3 {
    //Дано
    //Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    //массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    //это количество на экран на отдельной строке

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массива
        int[] array = lp.initializeArray(15);

        //Заполнение массива случайными числами
        array = lp.fillArrayWithWholeNumbers(array, 99);

        //Вывод массива
        lp.printArrayElementsHorizontally(array);

        //Вывод кол-ва четных чисел
        System.out.println("Четных чисел - " + lp.countEvenNumbers(array));

        //Вывод кол-ва нечетных чисел
        System.out.println("Нечетных чисел - " + countOddNumbers(array));
    }

    public static int countOddNumbers(int[] countOddInArray) {
        int counter = 0;
        for (int i = 0; i < countOddInArray.length; i++) {
            if (countOddInArray[i] % 2 == 1) counter++;
        }
        return counter;
    }
}

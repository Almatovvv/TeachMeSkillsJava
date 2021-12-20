package com.techmeskills.lesson3.task6;

import com.techmeskills.lesson3.lessonhelper.LessonHelper;

public class Task6 {
    //Дано
    //Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    //на экран в строку. Определить и вывести на экран сообщение о том, является ли
    //массив строго возрастающей последовательностью

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массива
        int[] arrayOne = lp.initializeArray(4);

        //Заполнение массивов случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 10);

        //Печать элементов массива
        lp.printArrayElementsHorizontally(arrayOne);

        //Сравнение и вывод того, является ли массив элементов возрастающим
        System.out.println("Является ли массив строго возрастающей последовательностью чисел - " + checkIfArrayValuesInAscOrder(arrayOne));

    }

    public static boolean checkIfArrayValuesInAscOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}

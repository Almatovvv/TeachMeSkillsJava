package com.techmeskills.lesson3.task7;

import com.techmeskills.lesson3.LessonHelper.LessonHelper;

public class Task7 {
    //Дано
    //Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
    //какой элемент является в этом массиве максимальным и сообщите индекс его
    //последнего вхождения в массив.

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массива
        int[] arrayOne = lp.initializeArray(12);

        //Заполнение массивов случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 15);

        //Печать элементов массива
        lp.printArrayElementsHorizontally(arrayOne);

        //Записываем значение в переменную
        int indexOfHighestValue = indexOfHighestValueInArray(arrayOne);

        //Вывод результатов
        System.out.println("Самым большим значением в массиве является - " + arrayOne[indexOfHighestValue] + ", его индекс - " + indexOfHighestValue);

    }

    public static int indexOfHighestValueInArray(int[] array) {
        int highestValueIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] >= array[highestValueIndex]) highestValueIndex = i;
            else if (array[i] < array[i + 1] && array[i + 1] >= array[highestValueIndex]) highestValueIndex = i + 1;
        }
        return highestValueIndex;
    }
}

package com.techmeskills.lesson3.task4;

import com.techmeskills.lesson3.lessonhelper.LessonHelper;

public class Task4 {
    //Дано
    //Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
    //массив на экран в строку. Замените каждый элемент с нечётным индексом на
    //ноль. Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массива
        int[] array = lp.initializeArray(20);

        //Заполнение массива случайными числами
        array = lp.fillArrayWithWholeNumbers(array, 20);

        //Вывод массива
        System.out.println("Первичный массив");
        lp.printArrayElementsHorizontally(array);

        //Замена нечетных иднексов массива нулем
        array = replaceOddIndexesOfArray(array);

        //Печать измененного массива
        System.out.println("Измененный массив");
        lp.printArrayElementsHorizontally(array);

    }

    public static int[] replaceOddIndexesOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) array[i] = 0;
        }
        return array;
    }
}

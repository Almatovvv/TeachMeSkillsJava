package com.techmeskills.lesson3.task5;

import com.techmeskills.lesson3.LessonHelper.LessonHelper;

public class Task5 {
    //Дано
    //Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    //выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    //арифметическое элементов каждого массива и сообщите, для какого из
    //массивов это значение оказалось больше (либо сообщите, что их средние
    //арифметические равны)

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массивов
        int[] arrayOne = lp.initializeArray(5);
        int[] arrayTwo = lp.initializeArray(5);

        //Заполнение массивов случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 15);
        arrayTwo = lp.fillArrayWithWholeNumbers(arrayTwo, 15);

        //Создаем переменные в которых будем хранить средние значения массивов
        int averageValueOfArrayOne = lp.averageValueOfArray(arrayOne);
        int averageValueOfArrayTwo = lp.averageValueOfArray(arrayTwo);

        //Вывод средних значении
        System.out.println("Среднее значение первого массива - " + averageValueOfArrayOne + ", второго массива - " + averageValueOfArrayTwo);

        //Ветвление для сравнения средних значении
        if (averageValueOfArrayOne > averageValueOfArrayTwo)
            System.out.println("Среднее значение первого массива больше второго");
        else if (averageValueOfArrayOne < averageValueOfArrayTwo)
            System.out.println("Среднее значение второго массива больше первого");
        else System.out.println("Значения равны");
    }
}

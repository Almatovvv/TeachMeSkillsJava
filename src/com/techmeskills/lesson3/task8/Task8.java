package com.techmeskills.lesson3.task8;

import com.techmeskills.lesson3.lessonhelper.LessonHelper;

public class Task8 {
    //Дано
    //Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
    //массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
    //массива должен равняться отношению элемента из первого массива с i-ым
    //индексом к элементу из второго массива с i-ым индексом. Вывести все три
    //массива на экран (каждый на отдельной строке), затем вывести количество
    //целых элементов в третьем массиве.

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массивов
        int[] arrayOne = lp.initializeArray(10);
        int[] arrayTwo = lp.initializeArray(10);

        //Заполнение массивов случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 9);
        arrayTwo = lp.fillArrayWithWholeNumbers(arrayOne, 9);

        ///ЗАДАЧА НЕ РЕШЕНА В СВЯЗИ С ОТСУТСВИЕМ НЕКОТОРЫХ ЗНАНИИ ПО МАТЕМАТИКЕ =)

    }
}

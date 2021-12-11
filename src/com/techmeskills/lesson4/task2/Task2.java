package com.techmeskills.lesson4.task2;

import com.techmeskills.lesson4.LessonHelper.LessonHelper;

public class Task2 {
    //Дано
    //Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    //случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
    //матрицы).
    //2)Вывести нечетные элементы находящиеся под главной

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        int userInput = lp.userInput();

        //Инициализация двумерного массива
        int[][] arrayOne = lp.initializeArray(userInput);

        //Заполнение массива случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 50);

        //Печать массива в виде матрицы
        lp.printArrayElementsAsMatrix(arrayOne);

        //Вывод нечетных чисел на главной диагонали и ниже
        System.out.println("Вывод нечечтных чисел на главной диагонали и ниже");
        printOddValuesUnderMainDiagonal(arrayOne, userInput);


    }

    public static void printOddValuesUnderMainDiagonal(int[][] array, int arrayDimensionNum) {
        for (int i = 0; i < arrayDimensionNum; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 == 1 && array[i][j] != 0) System.out.print(array[i][j] + " ");
            }
        }
    }
}

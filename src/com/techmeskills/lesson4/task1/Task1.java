package com.techmeskills.lesson4.task1;

import com.techmeskills.lesson4.LessonHelper.LessonHelper;


public class Task1 {
    //Дано
    //Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    //случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
    //матрицы).
    //1)Почитать сумму четных элементов стоящих на главной диагонали.


    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        int userInput = lp.userInput();

        //Инициализация двумерного массива
        int[][] arrayOne = lp.initializeArray(userInput);

        //Заполнение массива случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 50);

        //Печать массива в виде матрицы
        lp.printArrayElementsAsMatrix(arrayOne);

        //Печать суммы четных чисел по главной диагонали
        System.out.println("Сумма четных чисел по главной диагонали: " + countSumOfEvenValuesByMainDiagonal(arrayOne, userInput));

    }

    public static int countSumOfEvenValuesByMainDiagonal(int[][] array, int arrayDimensionNum) {
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < arrayDimensionNum; i++) {
            if (array[i][i] % 2 == 0 && array[i][i] != 0) {
                sumOfEvenNumbers += array[i][i];
            }
        }
        return sumOfEvenNumbers;
    }

    public static boolean checkIfMatrixIsUniform(int[][] array) {
        if (array.length == array[0].length) return true;
        return false;
    }


}

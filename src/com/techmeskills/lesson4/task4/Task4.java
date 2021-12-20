package com.techmeskills.lesson4.task4;

import com.techmeskills.lesson4.lessonhelper.LessonHelper;

public class Task4 {
    //Дано
    //Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    //случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
    //матрицы).
    //4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        int userInput = lp.userInput();

        //Инициализация двумерного массива
        int[][] arrayOne = lp.initializeArray(userInput);

        //Заполнение массива случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 50);

        //Печать массива в виде матрицы
        lp.printArrayElementsAsMatrix(arrayOne);

        //Вывод суммы четных чисел выше побочной диагонали
        System.out.println("Вывод суммы четных чисел над побочной диагональю не включительно");
        System.out.println(countSumOfEvenNumbersAboveAntiDiagonal(arrayOne));

    }

    public static int countSumOfEvenNumbersAboveAntiDiagonal(int[][] matrix) {
        int sumOfEvenNumbers = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - i - 1; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sumOfEvenNumbers += matrix[i][j];
                }
            }
        }
        return sumOfEvenNumbers;
    }
}

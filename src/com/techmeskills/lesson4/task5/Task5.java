package com.techmeskills.lesson4.task5;

import com.techmeskills.lesson4.lessonhelper.LessonHelper;

import java.util.Arrays;

public class Task5 {
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

        //Транспонирование матрицы и вывод результата
        System.out.println("Транспонирование матрицы");
        lp.printArrayElementsAsMatrix(transposeMatrix(arrayOne));

    }

    public static int[][] transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}

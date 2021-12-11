package com.techmeskills.lesson4.task3;

import com.techmeskills.lesson4.LessonHelper.LessonHelper;

public class Task3 {
    //Дано
    //Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    //случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
    //матрицы).
    //3)Проверить произведение элементов какой диагонали больше.


    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        int userInput = lp.userInput();

        //Инициализация двумерного массива
        int[][] arrayOne = lp.initializeArray(userInput);

        //Заполнение массива случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 50);

        //Печать массива в виде матрицы
        lp.printArrayElementsAsMatrix(arrayOne);

        //Сравнение разных диагоналей
        compareProductOfNumberByDifferentDiagonals(arrayOne, userInput);

    }


    public static int productOfNumbersByMainDiagonal(int[][] array, int arrayDimensionNum) {
        int productNumber = 0;
        for (int i = 0; i < arrayDimensionNum; i++) {
            if (productNumber == 0) {
                productNumber += array[i][i];
            } else productNumber *= array[i][i];
        }
        return productNumber;
    }

    public static int productOfNumbersByAntiDiagonal(int[][] array, int arrayDimensionNum) {
        int productNumber = 0;
        int counter = arrayDimensionNum - 1;
        for (int i = 0; i < arrayDimensionNum; i++) {
            if (productNumber == 0) {
                productNumber += array[i][counter];
            } else productNumber *= array[i][counter];
            counter--;
        }
        return productNumber;
    }

    public static void compareProductOfNumberByDifferentDiagonals(int[][] array, int arrayDimensionNum) {
        int mainDiagonal = productOfNumbersByMainDiagonal(array, arrayDimensionNum);
        int antiDiagonal = productOfNumbersByAntiDiagonal(array, arrayDimensionNum);
        System.out.println("Произведение элементов по главной диагонали равно - " + mainDiagonal + ", по побочной диагонали - " + antiDiagonal);
        if (mainDiagonal > antiDiagonal) System.out.println("Произведение элементов по главной диагонали больше");
        else if (mainDiagonal < antiDiagonal) System.out.println("Произведение элементов по побочной диагонали больше");
        else System.out.println("Произведение элементов по главной и побочной диагонали равны");
    }
}

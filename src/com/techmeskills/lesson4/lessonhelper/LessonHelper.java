package com.techmeskills.lesson4.lessonhelper;

import java.util.Random;
import java.util.Scanner;

public class LessonHelper {
    //Здесь собраны те методы,которые используются более одного раза в разных заданиях

    Random random = new Random();


    public int[][] initializeArray(int numberOfRowsAndColumns) {
        return new int[numberOfRowsAndColumns][numberOfRowsAndColumns];
    }

    public void printArrayElementsAsMatrix(int[][] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int el : arrayToPrint[i]) {
                System.out.print(el + " ");
            }
            System.out.println("\n");
        }
    }

    public int[][] fillArrayWithWholeNumbers(int[][] arrayToFill, int randomBound) {
        for (int i = 0; i < arrayToFill.length; i++) {
            for (int j = 0; j < arrayToFill[i].length; j++) {
                arrayToFill[i][j] = random.nextInt(randomBound);
            }
        }
        return arrayToFill;
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов: ");
        int rowNumber = scanner.nextInt();
        return rowNumber;
    }


}

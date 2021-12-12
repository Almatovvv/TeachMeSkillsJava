package com.techmeskills.lesson3.LessonHelper;

import java.util.Random;

public class LessonHelper {

    //Здесь собраны те методы,которые используются более одного раза в разных заданиях

    Random random = new Random();

    public int countEvenNumbers(int[] countEvenInArray) {
        int counter = 0;
        for (int i = 0; i < countEvenInArray.length; i++) {
            if (countEvenInArray[i] % 2 == 0 && countEvenInArray[i] != 0) counter++;
        }
        return counter;
    }

    public int[] initializeArray(int sizeOfArray) {
        return new int[sizeOfArray];
    }

    public void printArrayElementsHorizontally(int[] arrayToPrint) {
        for (int el : arrayToPrint) {
            System.out.print(el + " ");
        }
        System.out.println("\n");
    }

    public int[] fillArrayWithWholeNumbers(int[] arrayToFill, int randomBound) {
        for (int i = 0; i < arrayToFill.length; i++) {
            arrayToFill[i] = random.nextInt(randomBound);
        }
        return arrayToFill;
    }

    public int averageValueOfArray(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum/array.length;
    }

    public static int countOddNumbers(int countUntil) {
        int counter = 0;
        for (int i = 0; i <= countUntil; i++) {
            if (i % 2 == 1) counter++;
        }
        return counter;
    }

    public static int countOddNumbers(int[] countOddInArray) {
        int counter = 0;
        for (int i = 0; i < countOddInArray.length; i++) {
            if (countOddInArray[i] % 2 == 1) counter++;
        }
        return counter;
    }
}

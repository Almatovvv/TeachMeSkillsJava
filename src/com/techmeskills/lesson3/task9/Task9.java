package com.techmeskills.lesson3.task9;

import com.techmeskills.lesson3.LessonHelper.LessonHelper;

import java.util.Scanner;

public class Task9 {
    //Дано
    //Пользователь должен указать с клавиатуры положительное число, а
    //программа должна создать массив указанного размера из случайных целых
    //чисел из [0;15] и вывести его на экран в строку. После этого программа должна
    //определить и сообщить пользователю о том, сумма какой половины массива
    //больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
    //пользователь введёт неподходящее число, то выдать соответствующее
    //сообщение

    public static void main(String[] args) {
        LessonHelper lp = new LessonHelper();

        //Инициализация массива
        int[] arrayOne = lp.initializeArray(userInput());

        //Заполнение массивов случайными числами
        arrayOne = lp.fillArrayWithWholeNumbers(arrayOne, 15);

        //Печать элементов массива
        lp.printArrayElementsHorizontally(arrayOne);

        //Подсчет половин
        countHalves(arrayOne);
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int userInputValue = scanner.nextInt();
        while (userInputValue <= 0) {
            System.out.println("Было введено не положительное число. Введите положительное число!");
            userInputValue = scanner.nextInt();
        }
        return userInputValue;
    }

    public static void countHalves(int[] array) {
        if (array.length % 2 == 0) {
            int halfOfIndex = array.length / 2;
            int firstHalfSum = countSumOfArrayByIndex(array, 0, halfOfIndex);
            int secondHalfSum = countSumOfArrayByIndex(array, halfOfIndex, array.length);
            if (firstHalfSum > secondHalfSum) System.out.println("Результат: " + firstHalfSum + " > " + secondHalfSum + "\nСумма первой половины массива больше второй");
            else if (firstHalfSum < secondHalfSum) System.out.println("Результат: " + firstHalfSum + " < " + secondHalfSum + "\nСумма второй половины массива больше первой");
            else System.out.println("Половины массива равны");
        } else System.out.println("Массив не делится на половину, программа закрывается.");
    }

    public static int countSumOfArrayByIndex(int[] array, int startIndex, int endIndex) {
        int arraySum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }
}

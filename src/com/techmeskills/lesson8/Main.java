package com.techmeskills.lesson8;

public class Main {
    //1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
    //последнего вхождения сивола(B).
    //2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
    //позиции 0
    //3)В исходной строке находятся слова, каждое слово на новой стороке. После
    //запуска программы вывести на экран слова, которые являются полиндромами.
    //4)Есть строка. После запуска программы на экран выподятся только те предложения, в которых от 3-х до 5-ти слов. Если в
    //предложении присутствует слово-палиндром, то не имеет значения какое кол-во
    //слов в предложении, оно выводится на экран.


    public static void main(String[] args) {

        // Задание №1
        String myString = "Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа";
        int startIndex = myString.indexOf("а"), endIndex = myString.lastIndexOf("в");
        char[] charsFromAToB = new char[endIndex - startIndex];
        myString.getChars(startIndex, endIndex, charsFromAToB, 0);
        System.out.println(charsFromAToB);

        // Задание №2
        char symbolOfIndex3 = myString.charAt(3);
        char symbolOfIndex0 = myString.charAt(0);
        System.out.println(myString.replace(symbolOfIndex3, symbolOfIndex0));

        // Задание №3
        for (String word : TextFormatterUtils.returnWordsInString(myString)) {
            if (TextFormatterUtils.isPalindromeOrNot(word)) {
                System.out.println(word);
            } else System.out.println("Палиндромов нет");
        }

        // Задание №4
        if ((TextFormatterUtils.countWordsInString(myString) >= 3 && TextFormatterUtils.countWordsInString(myString) <= 5) || TextFormatterUtils.isPalindromeOrNot(myString))
            System.out.println(myString);

    }
}
/// На днях будет переделан в стиль ООП
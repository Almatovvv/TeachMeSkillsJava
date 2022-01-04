package com.techmeskills.lesson8;

public class TextFormatterUtils {
    public static int countWordsInString(String stringToCountWords) {
        if (stringToCountWords == null || stringToCountWords.isEmpty()) {
            return 0;
        }
        String[] words = stringToCountWords.split("\\s+");
        return words.length;
    }

    public static String[] returnWordsInString(String stringToCountWords) {
        if (stringToCountWords == null || stringToCountWords.isEmpty()) {
            System.out.println("Строка пустая");
        }
        return stringToCountWords.split("\\s+");
    }

    public static boolean isPalindromeOrNot(String string) {
        String reverse = "";
        int length = string.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + string.charAt(i);
        if (string.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
    }

}

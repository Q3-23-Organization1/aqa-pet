package hw4;

public class IsPalindrome {

    /*1. Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[].
            Для конвертації рядка, використовувати метод toCharArray())*/
    static String isPalindrome(String text) {

        String result;

        char[] textToArray;
        textToArray = text.replaceAll("\\s", "").toLowerCase().toCharArray();

        for (int i = 0; i < textToArray.length / 2; i++) {

            if (textToArray[i] != textToArray[textToArray.length - 1 - i]) {
                return "String isn`t a palindrome";
            }
        }
        return "String is a palindrome";
    }

}

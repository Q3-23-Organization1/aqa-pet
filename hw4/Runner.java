package hw4;


import static hw4.ChangeArray.changeArray;
import static hw4.FindMaxMinValue.findMaxMinValue;
import static hw4.IsPalindrome.isPalindrome;
import static hw4.PrintNumberNegativeAndSumOddElements.printNumberNegativeAndSumOddElements;
import static hw4.TableOfValues.tableOfValues;

public class Runner {

    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";
        String text2 = "А роза на лапу Азора";

        int[] array = {-5, -1, 60, 0, 55, 48};
        int[][] array2 = {
                {-1, -2, 0},
                {-2,3000,4},
                {-100,-4,5}};

        System.out.println(isPalindrome(text));
        findMaxMinValue(array);
        changeArray(array);
        tableOfValues();
        printNumberNegativeAndSumOddElements(array2);
    }
}

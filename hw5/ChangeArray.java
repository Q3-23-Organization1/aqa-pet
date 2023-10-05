package hw4;

import java.util.Arrays;

public class ChangeArray {

  /*  3. Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0 і
    виводить отриманий масив на екран.*/
    static void changeArray(int[] array) {

        int[] copyArray = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] % 2 == 0) {
                copyArray[i] = 0;
            } else {
                copyArray[i] = array[i];
            }
        }

        System.out.println(Arrays.toString(copyArray));
    }
}

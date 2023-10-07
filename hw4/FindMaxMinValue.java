package hw4;

import java.util.Arrays;

public class FindMaxMinValue {

    //2. Написати програму, яка знаходить мінімальне і максимальне число в масиві.
    static void findMaxMinValue(int[] array) {

//      System.out.println(Arrays.stream(array).max());
//      System.out.println(Arrays.stream(array).min());

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("max " + max);
        System.out.println("min " + min);
    }
}
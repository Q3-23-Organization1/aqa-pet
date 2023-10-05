package hw4;

public class FindMaxMinValue {

    //2. Написати програму, яка знаходить мінімальне і максимальне число в масиві.
    static void findMaxMinValue(int[] array) {

//        System.out.println(Arrays.stream(array).max());
//        System.out.println(Arrays.stream(array).min());

        int max = 0;
        int min = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1] && array[i] > max) {
                max = array[i];
            } else if (array[i] < array[i + 1] && array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("max " + max);
        System.out.println("min " + min);

    }
}

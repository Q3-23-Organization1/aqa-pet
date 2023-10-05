package hw4;

/* 4. Написати програму, яка друкує таблицю значень sin(x),
        де х - від 0 до 360 з кроком 10.(значення мають бути записані в масив за допомогою циклу)*/
public class TableOfValues {

    static void tableOfValues() {
        double[] array = new double[37];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] =  Math.sin(i);
            System.out.println("sin(" + j + ") = " + array[i]);

            j = j+ 10;
        }
    }
}

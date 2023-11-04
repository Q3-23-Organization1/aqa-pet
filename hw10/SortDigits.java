package hw10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDigits {

    /*Задано список цілих чисел та число X. Не використовуючи допоміжних об'єктів і не змінюючи розмір списку,
     переставити елементи списку так,щоб спочатку йшли числа, що не перевищують X,
     а потім числа, більші за X.
     */

    public static void main(String[] args) {

        List<Integer> digitsList = Arrays.asList(1, 2, 4, 6, 7, 8, 76, 867, 3, 24, 5, 54, 10, -2);
        int x = 10;

        Collections.sort(digitsList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 <= x && o2 > x) {
                    return 1;
                } else if (o1 > x && o2 <= x) {
                    return -1;
                }
                return o2 - o1;
            }
        });

        System.out.println(digitsList);
    }
}


package hw10;


import java.util.*;


public class DeleteDuplicate {

    /*Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є. Початкову
    колекцію з 100 елементів потрібно заповнити випадковими числами (діапазон -20 20).
    На екран потрібно вивести обидві колекції та кількість видалених дублікатів.
     */

    public static void main(String[] args) {

        Random random = new Random();
        int randomVal;
        int removedDupl;

        List<Integer> digitsList = new ArrayList<>(100);
        Set<Integer> uniqueDigits = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            randomVal = random.nextInt(41) - 20;
            digitsList.add(randomVal);
        }

        uniqueDigits.addAll(digitsList);

        System.out.println(digitsList);
        System.out.println(uniqueDigits);

        removedDupl = digitsList.size() - uniqueDigits.size();

        System.out.println("Quantity of removed duplicates " + removedDupl);
    }
}

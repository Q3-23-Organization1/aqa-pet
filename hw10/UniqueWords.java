package hw10;

import java.util.*;

public class UniqueWords {

    /*Є List зі совами. Виділити всі унікальні слова. Для кожного слова підрахувати частоту його входження в текст.
    Слова, які відрізняються регістром літер, вважати різними. Використовувати клас HashMap.
     */

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("word", "WORD", "word", "cat", "cat", "Cat");
        Map<String, Integer> wordMap = new HashMap<>();

        for (String string : wordList) {
            if (wordMap.containsKey(string)) {
                int count = wordMap.get(string);
                wordMap.put(string, count + 1);
            } else {
                wordMap.put(string, 1);
            }
        }

        System.out.println(wordMap.entrySet());

        for (String word : wordMap.keySet()) {
            System.out.println("Frequency of occurrence: " + word + " - " + wordMap.get(word));
        }
    }
}

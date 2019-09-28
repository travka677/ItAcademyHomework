package lesson_10_collections;

import java.util.*;

/**
 * @author Daniil Kim
 *
 * Имеется текст. Следует составить для него частотный словарь.
 */

public class Task_6 {
    public static void main(String[] args) {

        String text = "This is   dictionary. My dictionary! I was codding this dictionary for fifty minutes or more. Much more";

        Map<String, Integer> dictionary = new TreeMap<>();

        text = text.trim();
        text = text.toLowerCase();

        String[] splitWords = text.split("\\s*(\\s|,|!|\\.)\\s*");

        System.out.println(Arrays.toString(splitWords));

        for (int i = 0; i<splitWords.length; i++){
            Integer count = 0;
            for (int j = 0; j<splitWords.length; j++){
                if (splitWords[i].equals(splitWords[j])){
                    count++;

                }

            }
            dictionary.put(splitWords[i], count);
        }

        System.out.println(dictionary);

    }
}

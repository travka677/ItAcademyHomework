package lesson_10_collections;

/**
 * @author Daniil Kim
 *
 * Использовать Алгоритмы. Не используя вспомогательных объектов,
 * переставить отрицательные элементы сгенерированного списка в конец, а положительные – в начало этого списка.
 */

import java.util.*;

public class Task_7 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        ListIterator<Integer> litr = numbers.listIterator();

        while (litr.nextIndex() < 10){
            Random random = new Random();
            int rand = (random.nextInt(10)-5);
            litr.add(rand);
        }
        System.out.println(numbers);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        
        System.out.println(numbers);
    }
}

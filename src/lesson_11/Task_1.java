package lesson_11;

/**
 * @author Daniil Kim
 *
 * 1. Написать метод countUnique, который принимает целочисленный список в качестве параметра
 * и возвращает количество уникальных целых чисел в этом списке.
 * При получении пустого списка метод должен возвращать 0.
 *
 * Пример:
 *
 * [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
 */
import java.util.*;

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(3);
        numbers.add(-1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(15);
        numbers.add(15);

        System.out.println(countUnique(numbers));

    }

    static int countUnique(List<Integer> list){

        Set<Integer> set = new HashSet<>();

        set.addAll(list);

        return set.size();
    }
}

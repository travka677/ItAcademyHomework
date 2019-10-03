package lesson_17_lambda;

/**
 * Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */
import java.util.*;

public class Task_3 {
    static int sum;
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("asdfasdf", 7);
        map.put("asdfg", 2);
        map.put("asdg", 2);
        map.put("asdd", 15);
        map.put("asdhtyt", 2);
        map.put("asde", 4);
        map.put("asda", 3);

        sum = map.entrySet().stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getKey().length()<7)
                .mapToInt(value -> value.getValue())
                .sum();

        System.out.println(sum);

    }
}

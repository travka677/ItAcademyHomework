package lesson_17_lambda;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Daniil Kim
 * Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */

@FunctionalInterface
interface Summable{
    int sum(Map<String, Integer> map);
}

public class Task_3 {
    public static void main(String[] args) {

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("qwerty", 3);
        stringIntegerMap.put("qwertyu", 1);
        stringIntegerMap.put("qwe", 4);
        stringIntegerMap.put("qw", 2);
        stringIntegerMap.put("q", 1);

        Summable summable = map -> {
            Set<String> set = new HashSet<>();
            set.addAll(map.keySet());

            int sum = 0;
            for (String s : set){
                if (s.length()<7){
                    sum += map.get(s);
                }
            }
            return sum;
        };

        System.out.println(summable.sum(stringIntegerMap));
    }
}

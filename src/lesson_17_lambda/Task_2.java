package lesson_17_lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Daniil Kim
 * Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */

@FunctionalInterface
interface Uniqueness{
    int countUnique(List<String> list);
}

public class Task_2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("some");
        strings.add("some");
        strings.add("some string");
        strings.add("some string");
        strings.add("unique string1");
        strings.add("unique string2");
        strings.add("unique string3");

        Uniqueness uniqueness = list -> {
            Set<String> set = new HashSet<>();
            set.addAll(list);

            int count = 0;
            for (String s : set){
                if (s.length()>8){
                    count++;
                }
            }
            return count;
        };

        System.out.println(uniqueness.countUnique(strings));

    }
}

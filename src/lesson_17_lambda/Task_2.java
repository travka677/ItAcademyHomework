package lesson_17_lambda;

/**
 * Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */
import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("лалалалала");
        list.add("щащащащаща");
        list.add("зазазазаза");
        list.add("зазазазазa");
        list.add("дадададада");
        list.add("дадададада");
        list.add("хахахаха");
        list.add("хахахахаха");
        list.add("хАхАхаХаХа");
        list.add("кек");
        long stream = list.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(stream);
    }
}

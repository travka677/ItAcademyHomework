package lesson_17_lambda;

/**
 * Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        StringBuilder sb = new StringBuilder();
        for (Integer i : numbers) {
            sb.append(i);
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
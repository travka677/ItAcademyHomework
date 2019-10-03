package lesson_17_lambda;

/**
 * Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */

import java.util.*;

public class Task_1 {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Random rand = new Random();
            double num = rand.nextInt(31);
            list.add(num);
        }
        System.out.println(list.toString());
        String stream = list.stream()
                .filter(integer -> integer%2!=0 && integer%5==0)
                .mapToDouble(Double::doubleValue)
                .average()
                .toString();
        System.out.println(stream);
    }
}
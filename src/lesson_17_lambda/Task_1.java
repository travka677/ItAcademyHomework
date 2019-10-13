package lesson_17_lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniil Kim
 * Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */

@FunctionalInterface
interface Calculator{
    int calculate(List<Integer> list);
}

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(155);
        numbers.add(45);

        Calculator calculator = list -> {
            Integer sum = 0;
            int count = 0;
            for (Integer i : list){
                if ((i%2 != 0) && (i%5 == 0)){
                    sum += i;
                    count++;
                }
            }
            return sum/count;
        };

        System.out.println(calculator.calculate(numbers));
    }
}

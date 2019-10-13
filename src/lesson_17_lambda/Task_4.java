package lesson_17_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Daniil Kim
 * Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */

@FunctionalInterface
interface Printable{
    String print(List<Integer> list);
}

public class Task_4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (Integer i = 5; i>0; i--){
            numbers.add(i);
        }
        System.out.println(numbers);

        Printable printString = list -> {
            StringBuilder sb = new StringBuilder();

            for (Integer i : list){
                sb.append(String.valueOf(i));
            }
            return sb.toString();
        };

        System.out.println(printString.print(numbers));
    }
}

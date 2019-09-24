package lesson_11.task_4;

/**
 * @author Daniil Kim
 *
 * 4. Реализовать структуру «Черный ящик» хранящую целые числа.
 * Структура должна поддерживать операции добавления числа
 * и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */

import java.util.*;

public class BlackBox{

    private List<Integer> numbers;


    BlackBox(){
        numbers = new ArrayList<>();
    }


    public void addToNumbers(Integer num){
        numbers.add(num);
    }

    public List<Integer> getNumbers(){
        return numbers;
    }
}

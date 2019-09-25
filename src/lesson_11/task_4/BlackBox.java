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


    public void addToBox(Integer num){
        numbers.add(num);
    }

    public List<Integer> getNumbers(){
        return numbers;
    }


    public Integer min(int k){

        Collections.sort(numbers);

        if (k>0 && k<=numbers.size()){
            return numbers.get(k-1);
        } else {
            throw new IllegalArgumentException();
        }
    }



    public Integer max(int n){

        Collections.sort(numbers);
        Collections.reverse(numbers);

        if (n>0 && n<=numbers.size()){
            return numbers.get(n-1);
        } else {
            throw new IllegalArgumentException();
        }
    }
}

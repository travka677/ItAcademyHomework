package lesson_10_collections;

import java.util.*;

/**
 * @author Daniil Kim
 * Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */

public class Task_2 {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        ListIterator<Integer> litr = marks.listIterator();

        while (litr.nextIndex() < 10){
            Random random = new Random();
            Integer rand = 1 + random.nextInt(10);
            litr.add(rand);
        }
        System.out.println(marks);


        Integer max = 0;

        while (litr.hasPrevious()){
            Integer mark = litr.previous();
            if (mark > max){
                max = mark;
            }
        }
        System.out.println("Max mark = " + max);



    }
}

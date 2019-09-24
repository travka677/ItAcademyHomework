package lesson_10_collections;

import java.util.*;

/**
 * @author Daniil Kim
 *
 * Задание. Создать список оценок учеников с помощью ListIterator,
 * заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        ListIterator<Integer> litr = marks.listIterator();

        while (litr.nextIndex() < 10){
            Random random = new Random();
            Integer rand = 1 + random.nextInt(10);
            litr.add(rand);
        }
        System.out.println(marks);

        while (litr.hasPrevious()){
            if (litr.previous()  < 4){
                litr.remove();
            }
        }
        System.out.println(marks);
    }
}

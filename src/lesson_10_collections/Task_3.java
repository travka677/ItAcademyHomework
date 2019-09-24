package lesson_10_collections;

import java.util.*;

/**
 * @author Daniil Kim
 *
 * Вывести учеников из списка в обратном порядке. (2 варианта решения).
 */

public class Task_3 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Bob");
        students.add("Ted");
        students.add("John");
        students.add("Amanda");
        students.add("Sofia");
        System.out.println(students + "\n");

        System.out.println("В обратном порядке:");

        ListIterator<String> litr = students.listIterator(students.size());

        // variant 1
        while (litr.hasPrevious()){
            System.out.print(litr.previous() + " ");
        }
        System.out.println();




        // variant 2
        for (int i = students.size()-1; i >= 0; i--){
            System.out.print(students.get(i) + " ");
        }
        System.out.println();




        // variant 3
        ListIterator<String> litr2 = students.listIterator();

        while (litr2.hasNext()){
            litr2.next();
        }
        while (litr2.hasPrevious()){
            System.out.print(litr2.previous() + " ");
        }
    }
}

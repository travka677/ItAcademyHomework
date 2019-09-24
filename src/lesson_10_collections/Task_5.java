package lesson_10_collections;

import java.util.*;

/**
 * @author Daniil Kim
 *
 * Определить множество на основе множества целых чисел.
 * Создать методы для определения пересечения и объединения множеств.
 */

public class Task_5 {
    public static void main(String[] args) {

        Set<Integer> intNumbers = new HashSet<>();

        for (Integer i = -5; i < 10; i++){
            intNumbers.add(i);
        }
        System.out.println(intNumbers);


        // collection of even numbers
        Set<Integer> evenNum = new HashSet<>();

        for (Integer i : intNumbers){
            if (i % 2 == 0){
                evenNum.add(i);
            }
        }
        System.out.println("Collection of even numbers: " + evenNum);

        System.out.println("Union of sets: " + union(intNumbers, evenNum)); // union
        System.out.println("Intersection of sets: " + intersection(intNumbers, evenNum));

    }

    // union
    static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> unionCol = new HashSet<>();

        unionCol.addAll(set1);
        unionCol.addAll(set2);

        return unionCol;
    }


    // intersection
    static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> interCol = new HashSet<>();

        for (Integer i : set1){
            if (set2.contains(i)){
                interCol.add(i);
            }
        }

        return interCol;
    }
}

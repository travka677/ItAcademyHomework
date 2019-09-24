package lesson_11;

/**
 * @author Daniil Kim
 *
 *  Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 *
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
 */

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {


        //(2x^0 + 1x^3 + 5x^4 + 5x^3 + 3x^4 = 2 + 6x^3 + 8x^4.)

        Map<Integer, Integer> map1 = new HashMap<>();  // многочлен 1

        map1.put(4,5);
        map1.put(3,1);
        map1.put(0,2);


        Map<Integer, Integer> map2 = new HashMap<>();  // многочлен 2

        map2.put(3,5);
        map2.put(4,3);


        Map<Integer, Integer> result = new HashMap<>();  // результ слияния (многочлен 3)

        // ключи
        Set<Integer> set1 = new HashSet<>();
        set1.addAll(map1.keySet());

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(map2.keySet());



        // запись в result
        for (Integer i : set2){
            result.put(i, map2.get(i));
        }
        for (Integer i : set1){
            if (set2.contains(i)){
                result.put(i, (map1.get(i) + map2.get(i)));
            } else {
                result.put(i, map1.get(i));
            }
        }

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(result);



        // вывод в формате
        for (Integer i : set1){
            System.out.print(map1.get(i)+"x^"+i + " + ");
        }
        for (Integer i : set2){

            System.out.print(map2.get(i)+"x^"+i);
            if (i == (set2.size()+2)){
                System.out.print(" = ");
            }else {
                System.out.print(" + ");
            }

        }

        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(result.keySet());

        for (Integer i : resultSet){

            if (i == 0){
                System.out.print(result.get(i));
            }else{
                System.out.print(result.get(i)+"x^"+i);
            }

            if (i == (resultSet.size()+1)){
                System.out.print(".");
            }else {
                System.out.print(" + ");
            }
        }
    }
}

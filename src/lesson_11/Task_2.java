package lesson_11;

/**
 * @author Daniil kim
 *
 * 2. Написать метод isUnique, который принимает Map<String, String> и возвращает true,
 * если два различных ключа не соответствуют двум одинаковым значениям.
 * Например, в данном случае вернётся true:
 *
 * {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
 *
 * А в данном - false:
 *
 * {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();

        names.put("Marty", "Stepp");
        names.put("Stuart", "Stepp");
        names.put("Jessica", "Miller");
        names.put("Amanda", "Camp");
        names.put("Hal", "Perkins");
        names.put("Hal2", "Perkins");


        isUnique(names);
    }


    // если ключи всегда уникальные, ищем дубликаты только среди значений
    static boolean isUnique(Map<String, String> map) {

        boolean flag = true;

        List<String> list = new ArrayList<>();
        list.addAll(map.values());

        for (int i = 0; i < list.size()-1; i++) {
            String s1 = list.get(i);
            for (int j = i+1; j<list.size()-1; j++){
                String s2 = list.get(j);
                if (s1.equals(s2)) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

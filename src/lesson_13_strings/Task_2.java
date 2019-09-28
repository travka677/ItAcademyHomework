package lesson_13_strings;

/**
 * @author Daniil Kim
 *
 * 2. Заменить все грустные смайлы :( в строке на весёлые :)
 */

public class Task_2 {
    public static void main(String[] args) {

        String s = "abc:( de:(ghi:(";
        System.out.println(s);

        s = s.replace(":(", ":)");

        System.out.println(s);

    }
}

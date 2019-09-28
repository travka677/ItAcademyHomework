package lesson_13_strings;

/**
 * @author Daniil Kim
 *
 * 3. Написать функцию, принимающую 2 параметра:
 * строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.
 */

public class Task_3 {
    public static void main(String[] args) {

        String text = " Hello we hello  ";
        String word = "hello";

        System.out.println(foo(text,word));

    }



    static boolean foo(String text, String word){

        text = text.trim();
        text = text.toLowerCase();
        word = word.toLowerCase();

        return text.startsWith(word) && text.endsWith(word);
    }
}

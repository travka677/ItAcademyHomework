package lesson_13_strings;

/**
 * @author Daniil Kim
 *
 * 6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 *
 * Пример: aaabbcdeef ->abcdef
 */

public class Task_6 {
    public static void main(String[] args) {

        String word = "aaabbbbcdeeeeff";

        StringBuilder sb = new StringBuilder(word);

        for (int i = 1; i<sb.length(); i++){
            if (sb.charAt(i) == sb.charAt(i-1)){
                sb.deleteCharAt(i);
                i--;

            }
        }

        System.out.println(sb);
    }
}

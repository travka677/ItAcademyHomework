package lesson_14_regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniil Kim
 *
 * 1. Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
 * В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний,
 * при этом оно должно начинаться с буквы.
 * Возможные домены верхнего уровня: .org .com
 */

public class Task_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z]\\w+(\\.org|\\.com)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()){
            System.out.println("является");
            System.out.println(matcher.group());
        } else {
            System.out.println("не является");
        }
    }
}

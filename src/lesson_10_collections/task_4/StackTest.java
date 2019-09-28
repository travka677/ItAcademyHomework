package lesson_10_collections.task_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniil Kim
 *
 * Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
 * Задать размер стека.
 * Внести цифру в стек.
 * Извлечь цифру из стека.
 * Вывести число, у которого цифры идут в обратном порядке.
 *
 */

public class StackTest {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number:");
            Integer num = in.nextInt();

            String number = num.toString();

            Stack stack = new Stack(10);

            for (int i = 0; i < number.length(); i++) {
                int digit = Character.getNumericValue(number.charAt(i));
                stack.push(digit);
            }
            stack.printStack();

        } catch (Exception e){
            System.err.println("Error");
        }






    }
}

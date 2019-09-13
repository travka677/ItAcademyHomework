package lesson_12.task_7;

/**
 * @author Daniil Kim
 *
 * Написать метод, который в 50% случаев бросает исключение.
 * Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
 */

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        try {
            throwException();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("Block finally");
        }
    }

    public static void throwException(){

        Random random = new Random();
        int exc = random.nextInt(2);

        if (exc == 1){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.out.println("No exception");
    }
}

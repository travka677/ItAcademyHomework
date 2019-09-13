package lesson_12.task_5;

/**
 * @author Daniil Kim
 *
 * Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
 * указав в качестве причины отловленное.
 */

public class MyException extends Exception {

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}

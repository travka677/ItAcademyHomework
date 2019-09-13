package lesson_12.task_4;

/**
 * @author Daniil Kim
 *
 * Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 * Добавить вконструктор своего класса возможность указания сообщения.
 */

public class TriangleException extends RuntimeException{

    public TriangleException(String message) {
        super(message);
    }
}

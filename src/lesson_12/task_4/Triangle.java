package lesson_12.task_4;

/**
 * @author Daniil Kim
 *
 * Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 * Добавить вконструктор своего класса возможность указания сообщения
 */

public class Triangle {

    private double side;

    public void setSide(double side) throws TriangleException {
        if (side <= 0){
            throw new TriangleException("Incorrect side");
        }
        this.side = side;
    }
}

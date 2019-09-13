package lesson_12.task_4;

/**
 * @author Daniil Kim
 *
 * Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 * Добавить вконструктор своего класса возможность указания сообщения.
 */

public class Test {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        try {
            triangle.setSide(-2.9);
        } catch (TriangleException e){
            e.printStackTrace();
        }
    }

}

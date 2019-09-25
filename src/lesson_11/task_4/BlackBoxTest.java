package lesson_11.task_4;

/**
 * @author Daniil Kim
 *
 * 4. Реализовать структуру «Черный ящик» хранящую целые числа.
 * Структура должна поддерживать операции добавления числа
 * и возвращение К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 */

public class BlackBoxTest {
    public static void main(String[] args) {

        BlackBox box = new BlackBox();

        box.addToBox(3);
        box.addToBox(5);
        box.addToBox(6);
        box.addToBox(1);
        box.addToBox(2);

        System.out.println(box.getNumbers());

        System.out.println(box.min(3));

        System.out.println(box.max(0));


    }
}

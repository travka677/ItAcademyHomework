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

        box.addToNumbers(4);
        System.out.println(box.getNumbers());
    }
}

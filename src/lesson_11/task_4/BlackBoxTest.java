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

        box.add(3);
        box.add(5);
        box.add(5);
        box.add(5);
        box.add(5);
        box.add(6);
        box.add(6);
        box.add(6);
        box.add(6);
        box.add(1);
        box.add(1);
        box.add(1);
        box.add(1);
        box.add(2);
        box.add(2);
        box.add(2);

        System.out.println(box.getNumbers());

        System.out.println(box.min(2));

        System.out.println(box.max(2));


    }
}

package lesson_12.task_3;

/**
 * @author Daniil Kim
 *
 * Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */

public class Test {
    public static void main(String[] args) {

      Square square = new Square();

      try {
          square.setSide(-2.4);
      } catch (SquareException e){
          e.printStackTrace();
      }
    }
}

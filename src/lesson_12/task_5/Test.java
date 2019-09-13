package lesson_12.task_5;

/**
 * @author Daniil Kim
 *
 * Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
 * указав в качестве причины отловленное.
 */

public class Test {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            try {
                throw new MyException("Arithmetic exception", e);
            } catch (MyException e1) {
                e1.printStackTrace();
            }
        }
    }
}

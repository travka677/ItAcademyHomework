package lesson_12.task_6;

/**
 * @author Daniil Kim
 *
 * Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
 * Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        try {
            throwRandomException();
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }
    }

    public static void throwRandomException(){

        Random random = new Random();
        int exc = random.nextInt(3);

        switch (exc){
            case 0:
                throw new ArithmeticException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            case 2:
                throw new NullPointerException();
        }
    }
}

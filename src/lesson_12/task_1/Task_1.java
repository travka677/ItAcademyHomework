package lesson_12.task_1;

/**
 * @author Daniil Kim
 * Объявите переменную со значением null. Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 */

public class Task_1 {
    public static void main(String[] args) {

        String temp = null;

        try{
            temp.length();
        } catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}

package lesson_13_strings;

/**
 * 1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String, 
 * второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
 */

public class Task_1 {
    public static void main(String[] args) {

        String s = "Operation ";
        StringBuilder str = new StringBuilder(s);

        long start = System.nanoTime();

        for (int i = 0; i<100000; i++){
            str.append(String.valueOf(i));
        }
        long finish = System.nanoTime();
        System.out.println(finish-start);



        start = System.nanoTime();

        for (int i = 0; i<100000; i++){
            s+=String.valueOf(i);
        }
        finish = System.nanoTime();

        System.out.println(finish-start);
    }
}

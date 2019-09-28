package lesson_13_strings;

import java.util.Formatter;

/**
 * @author Daniil Kim
 *
 * 7. Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями.
 * Если число выходит за размер 10 символов вернуть все нули.
 * Пример variant1(22) -> 0000000022
 * Найти 3 способа решения задачи и определить наиболее быстрый способ.
 *
 */

public class Task_7 {
    public static void main(String[] args) {

        long start, finish;

        start = System.nanoTime();
        System.out.println(variant1(12345678912L));  // 3 место (40187500)
        finish = System.nanoTime();
        System.out.println(finish-start);

        start = System.nanoTime();
        System.out.println(variant2(12345678912L));  // 2 место (164300)
        finish = System.nanoTime();
        System.out.println(finish-start);

        start = System.nanoTime();
        System.out.println(variant3(12345678912L));  // 1 место (89300)
        finish = System.nanoTime();
        System.out.println(finish-start);

    }


    static String variant1(long number){

        String s = String.valueOf(number);
        Formatter fmt = new Formatter();

        if (s.length() > 10){
            s = s.replaceAll("\\d", "0");
            return s;
        }else {
            return String.valueOf(fmt.format("%010d", number));
        }
    }



    static String variant2(long number){

        String s = String.valueOf(number);
        Formatter fmt = new Formatter();

        if (s.length()>10){
            for (int i = 1; i<10; i++) {
                s = s.replace(String.valueOf(i), "0");
            }
            return s;
        }else {
            return String.valueOf(fmt.format("%010d", number));
        }
    }



    static String variant3(long number){

        String s = String.valueOf(number);
        StringBuilder sb = new StringBuilder(s);
        Formatter fmt = new Formatter();

        if (s.length()>10){
            for (int i = 0; i<sb.length(); i++){
                if (sb.charAt(i) != '0'){
                    sb.setCharAt(i,'0');
                }
            }
            return String.valueOf(sb);
        }else {
            return String.valueOf(fmt.format("%010d", number));
        }
    }
}

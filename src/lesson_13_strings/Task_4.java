package lesson_13_strings;

/**
 * @author Daniil Kim
 *
 * 4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество
 * и возвращающую инициалы в формате "Ф.И.О".
 * Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

public class Task_4 {
    public static void main(String[] args) {

        System.out.println(initials("Kim", "daniil", "zhekavich"));

    }

    static String initials(String fName, String sName, String lName){
        String shortName = fName.charAt(0)+"."+sName.charAt(0)+"."+lName.charAt(0);
        shortName = shortName.toUpperCase();
        return shortName;
    }
}

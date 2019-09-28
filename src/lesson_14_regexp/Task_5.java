package lesson_14_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniil Kim
 *
 * 5. Написать метод, который проверяет, является ли строка адресом IPv4.
 * Пример корректных IPv4
 * 0.0.0.0
 * 0.0.1.0
 * 255.0.0.1
 * 255.55.255.255
 * 192.168.0.1
 *
 * Не корректный
 * 001.0.0.0
 * 256.1.1.1
 * 1.1.1.1.
 * -1.0.-1.1
 *
 */

public class Task_5 {
    public static void main(String[] args) {

        System.out.println(checkIP("255.0.0.1"));

    }

    static boolean checkIP(String ip){

        if (ip == null || ip.isEmpty()){
            return false;
        }
        ip = ip.trim();

        if (ip.length()<6 || ip.length()>15){
            return false;
        }
        Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}

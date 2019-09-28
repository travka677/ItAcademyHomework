package lesson_14_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniil Kim
 *
 * 4. Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
 * и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
 * X - код оператора
 * Y - номер телефона
 *
 */

public class Task_4 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(\\+375)(29|33|44)(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher("+375294567854 +3464445534423  +375295678900+37544ghj5467 " +
                "+375330001122  hfd+375444567654  +3752934256990");

        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1)+" ("+matcher.group(2)+") "+matcher.group(3)+"-"+matcher.group(4)+"-"+matcher.group(5));

        }


    }
}

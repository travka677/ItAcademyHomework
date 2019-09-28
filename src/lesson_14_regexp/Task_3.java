package lesson_14_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Daniil Kim
 *
 * 3. Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех,
 * у которых есть параметры, например <p id ="p1">,
 * и замену их на простые теги абзацев <p>.
 *
 */

public class Task_3 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("(<\\s*p\\s*>)|(<\\s*p\\s*id\\s*=\\s*\"\\s*\\w+\"\\s*>)");
        Matcher matcher = pattern.matcher(" hello<s> my friend<  p> <s>  < p id = \"g\">< p id = \"343fgds\">  <p  id= \"hh4323\"> ");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        System.out.println(matcher.replaceAll("<p>"));


    }
}

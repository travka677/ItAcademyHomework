package lesson_13_strings;

/**
 * @author Daniil Kim
 *
 * 5. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */

public class Task_5 {
    public static void main(String[] args) {

        String text = "   one two   three four   five  ";

        text = text.trim();
        text = text.replaceAll("\\s+", " ");
        System.out.println(text);

        char[] symbols = text.toCharArray();
        int count = 0;

        if (symbols.length == 0){
            System.out.println(count);
        } else {
            for (int i = 0; i<symbols.length; i++){
                if (symbols[i] == ' '){
                    count++;
                }
            }
            System.out.println(++count);
        }


    }
}

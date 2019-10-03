package lesson_15_io;

/**
 * @author Daniil Kim
 *
 * 2. Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */

import java.io.*;

public class Task_2 {
    public static void main(String[] args) {

        File file = new File(File.separator+"English"+File.separator+"input.txt");

        if (file.exists()){
            if (file.isFile()){
                try (FileInputStream fis = new FileInputStream(file);
                     InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                     BufferedReader bf = new BufferedReader(isr))
                {
                    String s;
                    while ((s=bf.readLine()) != null) {
                        String[] line = s.split("\\s*(\\s|,|!|\\.)\\s*");
                        for (int i = 0; i<line.length; i++){
                            if (line[i].matches("\\b(a|A|e|E|i|I|o|O|u|U|y|Y)\\w+")){
                                System.out.println(line[i]);
                            }
                        }
                    }
                }catch (IOException e){
                    System.err.println(e);
                }
            }
        }else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println("File "+file.getName()+" does not exist");
            }

        }
    }
}

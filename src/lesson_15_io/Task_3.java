package lesson_15_io;

/**
 * @author Daniil Kim
 * 3. Задан файл с текстом, найти и вывести в консоль все слова, 
 * для которых последняя буква одного слова совпадает с первой буквой следующего слова
 */
import java.io.*;
public class Task_3 {
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
                        for (int i = 0; i<line.length; i++) {
                            if (i == line.length-1) {
                                break;
                            } else {
                                if (Character.toLowerCase(line[i].charAt(line[i].length() - 1)) == Character.toLowerCase(line[i + 1].charAt(0))) {
                                    System.out.println(line[i] + " " + line[i + 1]);
                                }
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

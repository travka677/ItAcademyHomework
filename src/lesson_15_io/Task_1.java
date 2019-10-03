package lesson_15_io;

/**
 * @author Daniil Kim
 *
 * 1. Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 *
 */
import java.io.*;

public class Task_1 {
    public static void main(String[] args) {

        File file = new File(File.separator+"English"+File.separator+"input.txt");

        if (file.exists()){
            if (file.isFile()){
                try (FileInputStream fis = new FileInputStream(file);
                     InputStreamReader isr = new InputStreamReader(fis);
                     BufferedReader br = new BufferedReader(isr))
                {
                    String line;
                    while ((line=br.readLine()) != null){
                        System.out.println(line);
                    }
                } catch (IOException e){
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

package lesson_15_io;

/**
 * @author Daniil Kim
 * 7. Задан файл с java-кодом. 
 * Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки. 
 */
import java.io.*;

public class Task_7 {
    public static void main(String[] args) {

        File file1 = new File(File.separator+"English"+File.separator+"Task_3.txt");
        File file2 = new File(File.separator+"English"+File.separator+"Task_3_output.txt");

        if (file1.exists()){
            if (file1.isFile()){
                try (FileInputStream fis = new FileInputStream(file1);
                     InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
                     BufferedReader bf = new BufferedReader(isr);
                     FileOutputStream fos = new FileOutputStream(file2);
                     OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
                     BufferedWriter bw = new BufferedWriter(osw))
                {
                    String s;
                    while ((s=bf.readLine()) != null) {
                        for(int i = s.length()-1; i>=0; i--){
                            bw.write(s.charAt(i));
                        }
                        bw.write('\n');
                    }
                }catch (IOException e){
                    System.err.println(e);
                }
            }
        }else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println("File "+file1.getName()+" does not exist");
            }
        }
    }
}


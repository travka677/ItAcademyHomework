package lesson_15_io;

/**
 * @author Daniil Kim
 * 4. Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */

import java.io.*;

public class Task_4 {
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
                        String[] numbers = s.split("\\D+");
                        int max = numbers[0].length();
                        int index = 0;
                        for (int i = 0; i<numbers.length; i++){
                            if (numbers[i].length() > max){
                                max = numbers[i].length();
                                index = i;
                            }
                        }
                        System.out.println(numbers[index]);
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

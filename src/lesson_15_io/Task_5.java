package lesson_15_io;

/**
 * @author Daniil Kim
 * 5. Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
 * Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
import java.io.*;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {

        final int AMOUNT = 20;

        File file = new File(File.separator + "English" + File.separator + "output.txt");
        Random random = new Random();

        if (file.exists()) {
            if (file.isFile()) {
                try (FileOutputStream fos = new FileOutputStream(file);
                     FileInputStream fis = new FileInputStream(file))
                {
                    int intOutput = 0;
                    byte byteOutput = 0;

                    for (int i = 0; i < AMOUNT; i++) {
                        intOutput = random.nextInt(200) + 256;
                        for (int j = 0; j <= 3; j++) {
                            byteOutput = (byte) (intOutput >> j * 8);
                            fos.write(byteOutput);
                        }
                    }

                    int input = 0;
                    int sum = 0;
                    int result;

                    while ((input = fis.read()) != -1) {
                        result = 0;
                        for (int j = 0; j <= 3; j++) {
                            result = result | (input << j * 8);
                            if (j != 3) {
                                input = fis.read();
                            }
                        }
                        sum+=result;
                        System.out.println("Result: " + result);
                    }
                    System.out.println((double) sum/AMOUNT);

                } catch (IOException e) {
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

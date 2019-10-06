package lesson_16;

/**
 * @author Daniil Kim
 * Сравнить скорость чтения и записи 5 МБ символов при использовании классов буфиризированого и не буфиризированого
 * символьного ввода вывода.
 */
import java.io.*;

public class Task_1 {
    public static void main(String[] args) {

        long start, finish;
        File file1 = new File(File.separator+"English"+File.separator+"readCompare.txt"); // 5260kb
        File file2 = new File(File.separator+"English"+File.separator+"writeCompare.txt");

        start = System.nanoTime();

        //simpleInput(file1);  // 169772100
        //bufferedInput(file1);  // 70413500
        //simpleOutput(file1, file2);  // 318276900
        bufferedOutput(file1, file2);  // 267442200

        finish = System.nanoTime();
        System.out.println(finish-start);
    }

    public static void simpleInput(File file) {
        if (file.exists()){
            if (file.isFile()){
                try (FileReader fr = new FileReader(file)) {
                    while (fr.read() != -1);
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

    public static void bufferedInput(File file) {
        if (file.exists()){
            if (file.isFile()){
                try (FileReader fr = new FileReader(file);
                     BufferedReader br = new BufferedReader(fr)) {

                    while (br.read() != -1);

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


    public static void simpleOutput(File file1, File file2) {
        if (file1.exists() && file2.exists()){
            if (file1.isFile() && file2.isFile()){
                try (FileReader fr = new FileReader(file1);  // read without BufferedReader
                     FileWriter fw = new FileWriter(file2))
                {
                    int c;
                    while ((c=fr.read()) != -1){
                        fw.write(c);
                    }
                }catch (IOException e){
                    System.err.println(e);
                }
            }
        }else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println("File does not exist");
            }

        }
    }

    public static void bufferedOutput(File file1, File file2) {
        if (file1.exists() && file2.exists()){
            if (file1.isFile() && file2.isFile()){
                try (FileReader fr = new FileReader(file1);  // read without BufferedReader
                     FileWriter fw = new FileWriter(file2);
                     BufferedWriter bw = new BufferedWriter(fw))
                {
                    int c;
                    while ((c=fr.read()) != -1){
                        bw.write(c);
                    }
                }catch (IOException e){
                    System.err.println(e);
                }
            }
        }else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println("File does not exist");
            }

        }
    }
}

package lesson_15_io;

/**
 * @author Daniil Kim
 * 6 Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
 *  Для этого использовать рекурсию
 */
import java.io.*;

public class Task_6 {
    public static void main(String[] args) {

        File dir = new File(File.separator+"English");

        dirInfo(dir);
    }

    public static void dirInfo(File dir) {

        if(dir.exists()) {
            if (dir.isDirectory()) {
                File[] files = dir.listFiles();
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getPath());
                    dirInfo(files[i]);
                }
            }
        }else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println(e);
            }
        }
    }
}

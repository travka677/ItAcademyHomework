package lesson_16.task_2_and_task_3;

import java.io.*;

public class SerializationUtil {

    public static void doSerialization(Object object, File file){
        if (file.exists()){
            if (file.isFile()){
                try (FileOutputStream fos = new FileOutputStream(file);
                     ObjectOutputStream ous = new ObjectOutputStream(fos))
                {
                    ous.writeObject(object);

                } catch (IOException e){
                    System.err.println(e);
                } catch (Exception e){
                    System.err.println(e);
                }
            }
        } else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println("File does not exist");
            }
        }
    }

    public static Object doDeserialization(File file){
        if (file.exists()){
            if (file.isFile()){
                try (FileInputStream fos = new FileInputStream(file);
                     ObjectInputStream ous = new ObjectInputStream(fos))
                {
                    return ous.readObject();

                } catch (IOException e){
                    System.err.println(e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                throw new FileNotFoundException();
            }catch (FileNotFoundException e){
                System.err.println("File does not exist");
            }
        }
        return null;
    }
}

package lesson_16.task_2_and_task_3;

import java.io.*;

/**
 * Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 *
 * Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad -
 * также созданного класса со своими полями. 
 * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Test {
    public static void main(String[] args) {

        File file = new File(File.separator+"English"+File.separator+"computer.txt");

        serializeClass(file);
        deserializeClass(file);
    }

    private static void serializeClass(File file) {
//        Computer computer = new Computer("asus", 8,256);
//        System.out.println(computer);
//        SerializationUtil.doSerialization(computer, file);

        // task 3
        Notebook notebook = new Notebook("asus s14", 8, 256, 800, new Touchpad(4.3,1.2));
        System.out.println(notebook);
        SerializationUtil.doSerialization(notebook, file);
}

    private static void deserializeClass(File file) {
//        Computer recoveredComputer = (Computer)SerializationUtil.doDeserialization(file);
//        System.out.println(recoveredComputer);

        // task 3
        Notebook recoveredNotebook = (Notebook)SerializationUtil.doDeserialization(file);
        System.out.println(recoveredNotebook);
    }



}

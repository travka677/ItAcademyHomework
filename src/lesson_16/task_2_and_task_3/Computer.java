package lesson_16.task_2_and_task_3;

import java.io.Serializable;

/**
 * @author Daniil Kim
 * Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 */
public class Computer implements Serializable {

    private static final long serialVersionUID = 17979505L;

    private String model;
    private int ram;
    private int memory;

    Computer(String model, int ram, int memory){
        this.model = model;
        this.ram = ram;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return getClass().getName()+"  {model: "+model+"} {ram: "+ram+"} {memory: "+memory+"}";
    }
}

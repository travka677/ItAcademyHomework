package lesson_16.task_2_and_task_3;

/**
 * Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad -
 * также созданного класса со своими полями. 
 * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Notebook  extends Computer{

    private static final long serialVersionUID = 342424212457L;

    private Touchpad touchpad;
    private transient int price;

    Notebook(String model, int ram, int memory, int price, Touchpad touchpad){
        super(model, ram, memory);
        this.price = price;
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return super.toString()+" {price: "+price+"}"+touchpad.toString();
    }
}

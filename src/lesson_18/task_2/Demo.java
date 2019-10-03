package lesson_18.task_2;

public class Demo {
    public static void main(String[] args) {
        Factory factory =new Factory();
        Dump dump = new Dump();
        Scientist scientist = new Scientist();
        factory.start();
        scientist.start();
    }
}

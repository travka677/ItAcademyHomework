package lesson_19;

public class Demo {
    public static void main(String[] args) {
        Factory factory =new Factory();
        Scientist scientist1 = new Scientist("Fedya");
        Scientist scientists2 = new Scientist("Petya");
        factory.start();
        scientist1.start();
        scientists2.start();
    }
}

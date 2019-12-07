package lesson_19_synchro;

public class Coordinator implements Runnable {

    @Override
    public void run() {
        Dump dump = new Dump();
        Factory factory = new Factory(dump);
        Servant servant_1 = new Servant(dump, "Servant 1");
        Servant servant_2 = new Servant(dump, "Servant 2");
        Scientist scientist_1 = new Scientist(servant_1, "Scientist 1");
        Scientist scientist_2 = new Scientist(servant_2, "Scientist 2");
        try {
            scientist_1.join();
            scientist_2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        factory.interrupt();
        Winner.determine(scientist_1, scientist_2);
        System.out.println(factory.isAlive());
        System.out.println(scientist_1.isAlive());
        System.out.println(scientist_2.isAlive());
    }
}

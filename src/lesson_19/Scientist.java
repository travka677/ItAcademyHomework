package lesson_19;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Scientist extends Thread {

    String name;

    private Random rand = new Random();

    private Map<Details, Integer> details;

    Scientist(String name){
        this.name = name;
        details = new HashMap<>();
    }

    synchronized private void take(Dump dump) {
        if (canTake()) {
            dump.getDetail(Details.randomDetail(), details);
        }
    }

    @Override
    public void run() {
        Scientist scientist = new Scientist(name);
        Dump dump = new Dump();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 4; j++) {
                scientist.take(dump);
            }
            try {
                Scientist.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }

        }
        System.out.println("Details of " + scientist.name + scientist.details);
        System.out.println(robots(scientist.details, scientist));
    }

    private boolean canTake() {
        boolean b = false;
        int chance = rand.nextInt(2);
        if (chance == 1) {
            b = true;
        }
        return b;
    }

    private String robots(Map<Details, Integer> details, Scientist scientist) {
        int number = Collections.min(details.values());
        return "Количество роботов которое " + scientist.name +" может собрать из деталей: " + number;
    }

}

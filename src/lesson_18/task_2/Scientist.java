package lesson_18.task_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Scientist extends Thread {

    private Random rand = new Random();

    static Map<Details, Integer> details = new HashMap<>();

    private void take() {
        if (canTake()) {
            Dump.get(Details.randomDetail());
        }
    }

    @Override
    public void run() {
        Scientist scientist = new Scientist();
        Dump dump = new Dump();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 4; j++) {
                scientist.take();
            }
            try {
                Scientist.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.out.println("Детали ученого " + details);
        System.out.println(robots(details));
    }

    private boolean canTake() {
        boolean b = false;
        int chance = rand.nextInt(2);
        if (chance == 1) {
            b = true;
        }
        return b;
    }

    private String robots (Map<Details, Integer> details){
        int number = Collections.min(details.values());
        return "Количество роботов которое ученый может собрать из деталей: " + number;
    }

}
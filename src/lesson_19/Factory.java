package lesson_19;

import java.util.Random;

class Factory extends Thread {

    private Random rand = new Random();

    private void detailsToTheDump(Dump dump) {
        if (isTrash()) {
            dump.put(Details.randomDetail());
        }
    }

    private boolean isTrash() {
        boolean b = false;
        int trash = rand.nextInt(2);
        if (trash == 1) {
            b = true;
        }
        return b;
    }

    @Override
    public void run() {
        Factory factory = new Factory();
        Dump dump = new Dump();
        for (int i = 0; i < 100; i++) {
            if (i == 1) {
                while (dump.amountOfDetails(dump) < 20) {
                    factory.detailsToTheDump(dump);
                }
                System.err.println("Свалка в первую ночь " + Dump.dump);
            } else {
                for (int j = 0; j < 4; j++) {
                    factory.detailsToTheDump(dump);
                }
            }
            try {
                Factory.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.err.println("Свалка в последнюю ночь " + Dump.dump);
    }

}

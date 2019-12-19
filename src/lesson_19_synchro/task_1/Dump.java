package lesson_19_synchro.task_1;

import lesson_19_synchro.task_1.Details;

import java.util.*;


public class Dump {

    private static final int FIRST_NIGHT_DETAILS_AMOUNT = 20;
    private List<Details> dump;


    public Dump(){
        dump = new ArrayList<>();
    }

    public void setDump() {
        Collections.addAll(dump, Details.randomDetails(FIRST_NIGHT_DETAILS_AMOUNT));
    }

    public synchronized List<Details> get(int number){
        int randAmount = (new Random().nextInt(number) + 1);
        while (dump.size() < randAmount){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        List<Details> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < randAmount; i++) {
            int randIndex = random.nextInt(dump.size());
            list.add(dump.get(randIndex));
            dump.remove(randIndex);
        }
        return list;
    }

    public synchronized void put(List<Details> list){  // свалка бесконечная по условию
        dump.addAll(list);
        notifyAll();
    }
}

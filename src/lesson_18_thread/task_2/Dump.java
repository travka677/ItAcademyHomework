package lesson_18_thread.task_2;

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

    // отдать детали прислужнику - удалить их со свалки
    public void giveToTheServant(Servant servant, int number) {
        if (!dump.isEmpty()){
            Random random = new Random();
            int randAmount = (new Random().nextInt(number) + 1);
            for (int i = 0; i < randAmount; i++) {
                int randIndex = random.nextInt(dump.size());
                servant.getBag().add(dump.get(randIndex));
                dump.remove(randIndex);
            }
        }
    }

    public List<Details> getDump() {
        return dump;
    }
}

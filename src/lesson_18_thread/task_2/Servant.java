package lesson_18_thread.task_2;

import java.util.*;

public class Servant{

    private List<Details> bag;
    private static final int BAG_SIZE = 4;
    private Dump dump;


    public Servant(Dump dump){
        this.dump = dump;
        bag = new ArrayList<>();
    }

    // собрать детали
    public void collect(){
        dump.giveToTheServant(this, BAG_SIZE);
    }


    public List<Details> getBag() {
        return bag;
    }
}

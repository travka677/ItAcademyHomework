package lesson_19_synchro.task_1;
import lesson_19_synchro.task_1.Details;
import lesson_19_synchro.task_1.Dump;

import java.util.*;

/**
 * В то же самое время прислужники обоих учёных отправляются на свалку, и каждый собирает от 1 до 4 случайных деталей.
 * Если на свалке деталей нет – прислужник уходит ни с чем.
 * Затем они возвращаются домой и отдают детали хозяевам.
 */

public class Servant {

    private String name;
    private List<Details> bag;
    private static final int BAG_SIZE = 4;
    private Dump dump;

    public Servant(Dump dump, String name){
        this.name = name;
        this.dump = dump;
        bag = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // собрать детали
    public void collect(){
        bag.addAll(dump.get(BAG_SIZE));
    }

    public List<Details> getBag() {
        return bag;
    }
}

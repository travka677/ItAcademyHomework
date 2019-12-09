package lesson_19_synchro;

import java.util.*;

public class Factory extends Thread {

    private static final int WASTE_SIZE = 4;
    private Dump dump;

    public Factory(Dump dump){
        this.dump = dump;
        start();
    }


    // Фабрика выбрасывает на свалку от 1 до 4 случайных деталей
    public List<Details> toTheDump(){
        List<Details> list  = new ArrayList<>();
        int randAmount = (new Random().nextInt(WASTE_SIZE) + 1);
        for (Details detail : Details.randomDetails(randAmount)){
            list.add(detail);
        }
        return list;
    }

    @Override
    public void run() {

        for (int i = 1; ; i++){
            if (i == 1){
                dump.setDump();
            }
            dump.put(toTheDump());
            try {
                sleep(100);
            }catch (InterruptedException e){
                break;
            }
        }
    }
}

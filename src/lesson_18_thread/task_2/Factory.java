package lesson_18_thread.task_2;

import java.util.*;

public class Factory extends Thread {

    private static final int WASTE_SIZE = 4;
    private Dump dump;

    public Factory(Dump dump){
        this.dump = dump;
    }


    // Фабрика выбрасывает на свалку от 1 до 4 случайных деталей
    public void toTheDump(){
        int randAmount = (new Random().nextInt(WASTE_SIZE) + 1);
        for (Details detail : Details.randomDetails(randAmount)){
            dump.getDump().add(detail);
        }
    }

    @Override
    public void run() {

        for (int i = 1; i<=50; i++){
            toTheDump();
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

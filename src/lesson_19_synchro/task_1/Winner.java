package lesson_19_synchro.task_1;

import lesson_19_synchro.task_1.Scientist;

public class Winner {

    public static void determine(Scientist scientist_1, Scientist scientist_2){
        if (scientist_1.getCount() > scientist_2.getCount()){
            System.err.println("Scientist 1 is the winner!");
        } else if (scientist_1.getCount() < scientist_2.getCount()){
            System.err.println("Scientist 2 is the winner!");
        } else {
            System.err.println("Draw");
        }
    }
}

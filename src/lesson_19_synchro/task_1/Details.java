package lesson_19_synchro.task_1;

import java.util.Random;

public enum Details {

    HEAD,
    BODY,
    LEFT_HAND,
    RIGHT_HAND,
    LEFT_LEG,
    RIGHT_LEG,
    CPU,
    RAM,
    HDD;

    public static Details[] randomDetails(int n){
        Details[] details = Details.values();
        Details[] rDetails = new Details[n];
        Random random = new Random();

        for (int i = 0; i<n; i++){
            rDetails[i] = details[random.nextInt(details.length)];
        }
        return rDetails;
    }
}

package lesson_19;

import java.util.Random;

enum Details {
    CPU,
    HDD,
    HEAD,
    LEFT_HAND,
    LEFT_LEG,
    RAM,
    RIGHT_HAND,
    RIGHT_LEG;

    static int numOfDetail;

    static Details randomDetail() {
        Details detail = null;
        Random rand = new Random();
        numOfDetail = rand.nextInt(8) + 1;
        switch (numOfDetail) {
            case 1:
                detail = Details.CPU;
                break;
            case 2:
                detail = Details.HDD;
                break;
            case 3:
                detail = Details.HEAD;
                break;
            case 4:
                detail = Details.LEFT_HAND;
                break;
            case 5:
                detail = Details.LEFT_LEG;
                break;
            case 6:
                detail = Details.RAM;
                break;
            case 7:
                detail = Details.RIGHT_HAND;
                break;
            case 8:
                detail = Details.RIGHT_LEG;
        }
        return detail;
    }

}

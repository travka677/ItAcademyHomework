package lesson_18.task_2;

import java.util.HashMap;
import java.util.Map;

class Dump {

    static Map<Details, Integer> dump;

    Dump() {
        dump = new HashMap<>();
    }

    void put(Details detail) {
        dump.put(detail, dump.get(detail) == null ? 1 : dump.get(detail) + 1);
    }

    static void get(Details detail) {
        if (!Dump.noDetails(detail)) {
            Scientist.details.put(detail, Scientist.details.get(detail) == null ?
                    1 : Scientist.details.get(detail) + 1);
            for (Map.Entry<Details, Integer> m : dump.entrySet()) {
                if (m.getKey() == detail && dump.get(detail) != 0) {
                    dump.put(detail, dump.get(detail) - 1);
                }
            }
        }
    }

    int amountOfDetails(Dump dump) {
        int sum = 0;
        for (Map.Entry<Details, Integer> m : dump.dump.entrySet()) {
            sum += m.getValue();
        }
        return sum;
    }

    static boolean noDetails(Details detail) {
        boolean b = false;
        if (dump.get(detail) == null) {
            b = true;
        }
        return b;
    }
}

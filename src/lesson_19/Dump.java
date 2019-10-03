package lesson_19;

import java.util.*;


class Dump {

    static Map<Details, Integer> dump;

    Dump() {
        dump = new HashMap<>();
    }

    synchronized void put(Details detail) {
        dump.put(detail, dump.get(detail) == null ? 1 : dump.get(detail) + 1);
    }

    synchronized void getDetail(Details detail, Map<Details, Integer> details) {
        if (!Dump.noDetails(detail)) {
            details.put(detail, details.get(detail) == null ?
                    1 : details.get(detail) + 1);
            for (Map.Entry<Details, Integer> m : dump.entrySet()) {
                if (m.getKey() == detail && dump.get(detail) != 0) {
                    dump.put(detail, dump.get(detail) - 1);
                }
            }
        }
    }

    int amountOfDetails(Dump dump) {
        int sum = 0;
        for (Map.Entry<Details, Integer> m : Dump.dump.entrySet()) {
            sum += m.getValue();
        }
        return sum;
    }

    private static boolean noDetails(Details detail) {
        boolean b = false;
        if (dump.get(detail) == null) {
            b = true;
        }
        return b;
    }
}

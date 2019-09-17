package lesson_9.task_1_and_task_2;

/**
 * @author Daniil  Kim
 *
 * Создать статический обобщённый метод swap в final классе PairUtil.
 * Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.
 */

public final class PairUtil {

    static <K, V> Pair<V, K> swap(Pair <K,V> pair){
        return new Pair<>(pair.getVariableTwo(), pair.getVariableOne());
    }
}

package lesson_9.task_1_and_task_2;

public class PairTest {
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(6, "text");

        System.out.println(pair.getVariableOne());
        System.out.println(pair.getVariableTwo());

    }
}

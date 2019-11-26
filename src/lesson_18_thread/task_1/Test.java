package lesson_18_thread.task_1;

import lesson_18_thread.task_1.DaemonThread;
import lesson_18_thread.task_1.NewThread;

public class Test {
    public static void main(String[] args) {

        new NewThread();
        new DaemonThread();
    }
}

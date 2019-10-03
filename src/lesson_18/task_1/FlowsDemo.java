package lesson_18.task_1;

public class FlowsDemo {
    public static void main(String[] args) {
        FirstFlow flow = new FirstFlow();
        DaemonFlow flow1 = new DaemonFlow();
        flow1.setDaemon(true);
        flow.start();
        flow1.start();
    }
}
package lesson_18.task_1;

public class DaemonFlow extends Thread {
    @Override
    public void run() {
        while (!FirstFlow.interrupted()) {
            System.out.println("Sum is " + FirstFlow.sum);
            try {
                DaemonFlow.sleep(5);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

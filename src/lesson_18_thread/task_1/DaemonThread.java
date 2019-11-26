package lesson_18_thread.task_1;

/**
 * Вместе с суммирующим потоком запустить поток демон,
 * который каждую пятую миллисекунду выводит в консоль текущее значение просуммированных элементов.
 */

public class DaemonThread extends Thread {

    public DaemonThread(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (!interrupted()){
            System.out.println("Sum = " + NewThread.sum);
            try {
                sleep(5);
            }catch (InterruptedException e){
                System.err.println(e);
            }
        }
    }
}

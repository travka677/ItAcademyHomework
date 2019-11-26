package lesson_18_thread.task_1;

/**
 * 1.Создать поток, который будет в цикле итерироваться от 1 до 10 000 000 и
 * суммировать каждый четный элемент кратный 3. На каждой итерации, кратной 1 000 000, поток должен заснуть на 10мс.
 */

public class NewThread extends Thread{

    static long sum = 0;

    public NewThread(){
        start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000000; i++){
            if (i%2 == 0 && i%3 == 0){
                sum+=i;
            }
            try {
                if (i%1000000 == 0){
                    sleep(10);
                }
            }catch (InterruptedException e){
                System.err.println(e);
            }
        }
    }
}

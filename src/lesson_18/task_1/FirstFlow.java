package lesson_18.task_1;

public class FirstFlow extends Thread {

    static long sum;

    @Override
    public void run() {
        for (int i = 0; i <= 10000000; i++) {
            if (i%2==0 && i%3==0){
                sum+=i;
            }
            if (i%1000000==0){
                try{
                    FirstFlow.sleep(10);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
        System.out.println("Final sum is " + sum);
    }

}
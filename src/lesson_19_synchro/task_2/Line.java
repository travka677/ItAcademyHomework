package lesson_19_synchro.task_2;

import java.util.*;
import java.util.concurrent.TimeoutException;

public class Line {

    private Deque<Customer> queue;

    Line(){
        queue = new ArrayDeque<>();
    }

    public synchronized void put(Customer customer){  // очередь бесконечная по условию
        queue.offerLast(customer);
        notifyAll();
    }

    //
    public synchronized Customer get(long timeout) throws InterruptedException, TimeoutException {
        long waitTime = timeout;
        while (queue.size() == 0 && waitTime > 0){
            long t0 = System.currentTimeMillis();
            wait(waitTime);
            long t1 = System.currentTimeMillis();
            long elapsedTime = t1 - t0;
            waitTime -= elapsedTime;
        }
        if (waitTime < 0){
            throw new TimeoutException();
        }
        return queue.pollFirst();
    }

    public Deque<Customer> getQueue() {
        return queue;
    }
}

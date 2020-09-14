package ThreadPractice;

import java.util.LinkedList;
import java.util.List;

/**
 * @author uttpal on May, 2020
 */
public class ProducerConsumerSolution {
    public static void main(String[] args) throws  InterruptedException{

        List<Integer> sharedResource = new LinkedList<>();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread t1 = new Thread(producer, "ProducerThread");
        Thread t2 = new Thread(consumer, "ConsumerThread");
        t1.start();
        Thread.sleep(1000);
        t2.start();

    }
}

package ThreadPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 703238043 on May, 2020
 */
public class ProducerConsumerSolution2 {
    public static void main(String[] args) throws  InterruptedException{

        //List<Integer> sharedQueue=new LinkedList<>();
        ProducerThread producerThread=new ProducerThread();
        ConsumerThread consumerThread=new ConsumerThread(producerThread);
        Thread t1 = new Thread(producerThread, "ProducerThread");
        Thread t2 = new Thread(consumerThread, "ConsumerThread");
        t2.start();
        Thread.sleep(100);
        t1.start();



    }
}

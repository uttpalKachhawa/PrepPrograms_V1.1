package ThreadPractice;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author 703238043 on May, 2020
 */
public class ProducerConsumerSolution3 {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue=new LinkedBlockingQueue<Integer>();
        ProducerThread1 t1=new ProducerThread1(blockingQueue);
        ConsumerThread1 t2=new ConsumerThread1(blockingQueue);
        Thread t=new Thread(t1);
        Thread tt=new Thread(t2);
        t.start();
        tt.start();

    }

}

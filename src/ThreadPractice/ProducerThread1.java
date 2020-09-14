package ThreadPractice;

import java.util.concurrent.BlockingQueue;

/**
 * @author utt on May, 2020
 */
public class ProducerThread1 implements Runnable {

    private final BlockingQueue<Integer> sharedQueue;

    ProducerThread1(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {

        for (int i = 1; i < 10; i++) {

            try {
                System.out.println("Produced : " + i);
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}

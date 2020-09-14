package ThreadPractice;



import java.util.concurrent.BlockingQueue;


/**
 * @author uttpal on May, 2020
 */
public class ConsumerThread1 implements  Runnable {

    private final BlockingQueue<Integer> sharedQueue;

    public ConsumerThread1(BlockingQueue sharedQueue){
        this.sharedQueue=sharedQueue;
    }


    @Override
    public void run() {

      while(true){
            try {
                System.out.println("CONSUMED : "+ sharedQueue.take());
                sharedQueue.take();
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }


    }
}

package ThreadPractice;

import java.util.LinkedList;
import java.util.List;

/**
 * @author uttpal on May, 2020
 */
public class ProducerThread implements Runnable {

    public List<Integer> sharedQueue;


    public ProducerThread(){
        sharedQueue=new LinkedList<>();
    }

    @Override
    public void run(){

        synchronized (this) {
            for(int i=1;i<=10;i++){ //Producer will produce 10 products
                sharedQueue.add(i);
                System.out.println("Producer is still Producing, Produced : "+i);

                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){e.printStackTrace();}

            }
            System.out.println("Production is over, consumer can consume.");
            //Production is over, notify consumer thread so that consumer can consume.
            this.notify();
        }
    }
}

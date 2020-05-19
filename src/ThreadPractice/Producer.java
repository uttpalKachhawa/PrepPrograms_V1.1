package ThreadPractice;

import java.util.List;

/**
 * @author 703238043 on May, 2020
 */
public class Producer implements  Runnable{

    private List<Integer> sharedQueue;
    private int maxsize=2;


    Producer(List<Integer> sharedQueue){

        this.sharedQueue=sharedQueue;
    }

    @Override
    public void run() {

        for(int i=0;i<=10;i++){

            try {
                produce(i);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }

    }

    private void produce(int i)throws  InterruptedException
    {
        //if sharedQueue is full wait until consumer consumes.
        synchronized (sharedQueue){
            while(sharedQueue.size()>maxsize){
                System.out.println("Queue is full, producerThread is waiting for "
                        + "consumerThread to consume, sharedQueue's size= "+maxsize);
                sharedQueue.wait();
            }

        }
        /* 2 Synchronized blocks have been used means before
         * producer produces by entering below synchronized
         * block consumer can consume.
         */

        //as soon as producer produces (by adding in sharedQueue) it notifies consumerThread.
        synchronized (sharedQueue){

            System.out.println("Produced = " + i);
            sharedQueue.add(i);
            Thread.sleep((long)(Math.random() * 1000));
            sharedQueue.notify();
        }


    }
}

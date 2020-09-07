package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class CustomBlockingQueueDemo1 {

    public static void main(String[] args) throws  InterruptedException{
        BufferClass<Integer> bufferClass=new BufferClass<>(5);

        ProducerThread2 producerThread2=new ProducerThread2(bufferClass);
        ConsumerThread2 consumerThread2=new ConsumerThread2(bufferClass);
        Thread t1=new Thread(producerThread2,"Producer");
        Thread t2= new Thread(consumerThread2,"Consumer");
       t1.start();
         Thread.sleep(1000);
       t2.start();
    }





}

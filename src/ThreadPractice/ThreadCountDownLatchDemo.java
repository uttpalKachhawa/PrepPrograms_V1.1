package ThreadPractice;

import java.util.concurrent.CountDownLatch;

/**
 * @author uttpal on May, 2020
 */
public class ThreadCountDownLatchDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(3);
        System.out.println("CountDownLatch has been created with count=3");

        new Thread(new MyRunnableTask(countDownLatch),"Thread-1").start();

        try {
            countDownLatch.await();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("count has reached zero, "+
                Thread.currentThread().getName()+" thread has ended");
    }



}

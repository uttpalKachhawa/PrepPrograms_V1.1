package ThreadPractice;

import java.util.concurrent.CountDownLatch;

/**
 * @author uttpal on May, 2020
 */
public class MyRunnableTask implements Runnable {
CountDownLatch countDownLatch;


MyRunnableTask(CountDownLatch countDownLatch){
    this.countDownLatch=countDownLatch;
}

    @Override
    public void run() {

    for(int i=2;i>=0;i--){
        countDownLatch.countDown();
        System.out.println(Thread.currentThread().getName()+
                " has reduced latch count to : "+ i);

        try{

            Thread.sleep(1000);
        }
        catch (InterruptedException  ex){
            ex.printStackTrace();
        }
    }

    }
}

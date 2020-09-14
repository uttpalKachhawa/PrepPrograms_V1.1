package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class MyThread1 implements  Runnable {

    @Override
    public void run() {

        for(int i=0;i<10;i++){
            System.out.println("child thread");
        }

    }
}

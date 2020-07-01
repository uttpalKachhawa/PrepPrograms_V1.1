package SynechronProblem;

/**
 * @author utpal on June, 2020
 */
public class MyRunnable1 implements  Runnable{
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + " Finished");

        try {
            Thread.currentThread().sleep(1000);

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

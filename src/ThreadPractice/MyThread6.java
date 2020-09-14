package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class MyThread6 extends Thread {

    int total = 0;

    @Override
    public void run() {

        synchronized (this) {

            System.out.println("child thread starts calculation");//stp2
            for (int i = 0; i < 100; i++) {
                total = total + i;
            }
            System.out.println("child thread giving notification call");//stp3
            this.notify();
        }
    }
}

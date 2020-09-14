package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class ThreadInterruptDemoClient {
    public static void main(String[] args) {
        MyThread3 myThread3=new MyThread3();
        myThread3.start();

        myThread3.interrupt();

        for(int i=0;i<5;i++){
            System.out.println("from MAIN thread");
        }

    }
}

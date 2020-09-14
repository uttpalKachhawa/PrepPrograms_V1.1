package ThreadPractice;

/**
 * @author uttpal on Aug, 2020
 */
public class TestMainThread {

    public static void main(String[] args) {
        Thread t1= new Thread(new TestThread1());
        t1.run();
        t1.run();
        t1.start();
    }
}

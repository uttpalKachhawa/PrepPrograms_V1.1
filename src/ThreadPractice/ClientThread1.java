package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class ClientThread1 {
    public static void main(String[] args) throws  InterruptedException {
       // Thread.currentThread().join();
        MyThread myThread=new MyThread();
        MyThread myThread1=new MyThread();
       // Thread t= new Thread(myThread);
        //myThread.setPriority(10);
        myThread.start();
        myThread1.start();



       // myThread.run(10);

        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }

    }
}

package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ThreadJoinClientDemo {
    public static void main(String[] args) throws  Exception{
        MyThread2 myThread2=new MyThread2();
        myThread2.start();
     // Thread.currentThread().join();

        for(int i =0;i<5;i++){
    Thread.sleep(2000);
            System.out.println("Main Thread");
        }
    }

}

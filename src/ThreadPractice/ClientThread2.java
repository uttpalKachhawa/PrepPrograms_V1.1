package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class ClientThread2 {
    public static void main(String[] args) {
//shortcut for sop is sout
        System.out.println("args = " + Thread.currentThread().getName());
        MyThread1 myThread1=new MyThread1();
        Thread thread1=new Thread();
        Thread thread2=new Thread(myThread1);
        System.out.println("thread2.getName() = " + thread2.getName());
        Thread.currentThread().setName("Utpal Thread");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        myThread1.run();

       for(int i=0;i<5;i++){
           System.out.println( "Main Thread" );
       }
    }
}

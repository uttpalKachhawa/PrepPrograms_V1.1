package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ThreadPriorityClient {
    public static void main(String[] args) {

        System.out.println("args = " + Thread.currentThread().getName());

       MyThread2 thread= new MyThread2();
        Thread.currentThread().setPriority(1);
        System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
       thread.start();

       for(int i=0;i<10;i++){
           System.out.println("main Thread");
       }
    }
}

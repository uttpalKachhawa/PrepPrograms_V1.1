package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ThreadYieldClientDemo {

    public static void main(String[] args) {
        MyThread2 myThread2=new MyThread2();
     //   System.out.println("myThread2 = " + Thread.currentThread().getName());
        myThread2.setPriority(1);
        //System.out.println("myThread2 = " + myThread2.getPriority());
        myThread2.start();

        for(int i=0;i<5;i++){
            Thread.yield();
            System.out.println("Main Thread");
        }

    }
}

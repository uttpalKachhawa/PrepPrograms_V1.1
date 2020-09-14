package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class ThreadDemoSynchronizedBlock {
    public static void main(String[] args) {

        CustomTaskObject1 customTaskObject1=new CustomTaskObject1();
        CustomTaskObject1 customTaskObject2=new CustomTaskObject1();
        MyThread5 t1=new MyThread5("Uttpal",customTaskObject1);
        MyThread5 t2=new MyThread5("Kachhawa",customTaskObject1);
        MyThread5 t3=new MyThread5("Madhav",customTaskObject1);
        t1.start();
        t2.start();
        t3.start();

       /* for(int i=0;i<5;i++){
            System.out.println("Main Thread Execution"+Thread.currentThread().getName());
        }*/

    }
}

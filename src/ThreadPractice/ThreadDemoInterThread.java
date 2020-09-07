package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ThreadDemoInterThread { public static void main(String[] args) throws Exception{
        MyThread6 myThread6=new MyThread6();
        myThread6.start();
        synchronized (myThread6){
            System.out.println("main thread call wait method"); //stp1
            myThread6.wait();
            System.out.println("main thread gets notification call");//stp4
            System.out.println(myThread6.total);

        }
    }

}

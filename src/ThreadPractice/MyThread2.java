package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class MyThread2 extends Thread {
    public static Thread myThread= null;

    @Override
    public void run() {

        try {
            myThread.join();
        }
        catch (Exception ex){

            ex.printStackTrace();
        }

        for(int i=0;i<5;i++){

          //  Thread.yield();
            System.out.println("childThread");
        }


    }
}

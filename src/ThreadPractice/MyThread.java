package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class MyThread extends Thread {

   volatile int a;

    @Override
    public void run() {

      /*  try {
            Thread.currentThread().join();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }*/


        for(int i=0;i<10;i++){
            System.out.println(a++ + "child thread"+Thread.currentThread().getName());

        }
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }

    public void run(int i){

        System.out.println("in arg run method");
    }

    /*public void start(){
        System.out.println("start method");
    }*/
}

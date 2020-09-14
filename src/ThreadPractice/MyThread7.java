package ThreadPractice;

/**
 * @author uttpal on Jul, 2020
 */
public class MyThread7 extends  Thread {

    @Override
    public void run() {
        int counter=0;
        while(!isInterrupted()){
            counter++;
            System.out.println("counter = " + counter);

            try{
                sleep(1000);

            }
            catch (InterruptedException ex){
                ex.printStackTrace();
                break;
            }
        }
    }
}

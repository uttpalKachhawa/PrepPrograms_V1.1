package ThreadPractice;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;

/**
 * @author 703238043 on Jul, 2020
 */
public class MyInteruptExampleClient {

    public static void main(String[] args) {
        MyThread7 t1=new MyThread7();
        t1.start();

        Scanner scanner= new Scanner(System.in);
        String decider=null;
        do{

            try{

                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println("Do u want to continue");
            decider=scanner.next();
        } while (decider.equals("yes"));
            t1.interrupt();

    }
}

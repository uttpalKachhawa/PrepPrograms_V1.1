package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class CustomTaskObject {


    public static synchronized void wish(String name){

        for(int i=0;i<5;i++){

            System.out.println("HelloCutsom Object");

            try{

                Thread.sleep(2000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(name);

        }
    }

}

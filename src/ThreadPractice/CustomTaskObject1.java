package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class CustomTaskObject1 {
    String name;

   public void wish(String name){
       System.out.println("Before method execution "+Thread.currentThread().getName());
       synchronized (this){
           for(int i=0;i<10;i++){
               System.out.println("Hello Custom Object");
           }
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

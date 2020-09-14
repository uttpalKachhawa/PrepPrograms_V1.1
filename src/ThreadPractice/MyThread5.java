package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class MyThread5 extends Thread {
    String name;
    CustomTaskObject1 customTaskObject1;


            public MyThread5(String name,CustomTaskObject1 customTaskObject1){
                this.customTaskObject1=customTaskObject1;
                this.name=name;
            }

    @Override
    public void run() {
        customTaskObject1.wish(name);
        super.run();
    }
}

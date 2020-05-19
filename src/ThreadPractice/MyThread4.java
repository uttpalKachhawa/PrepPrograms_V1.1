package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class MyThread4 extends  Thread {

    CustomTaskObject object;
    String name;

    MyThread4(CustomTaskObject customTaskObject,String name){
        this.name=name;
        this.object=customTaskObject;
    }


    @Override
    public void run() {
        object.wish(name);
        super.run();
    }
}

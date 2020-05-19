package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ThreadDemoSynchronization {

    public static void main(String[] args) {

        CustomTaskObject customTaskObject=new CustomTaskObject();
        CustomTaskObject customTaskObject1=new CustomTaskObject();
        MyThread4 t1=new MyThread4(customTaskObject,"uttpal");
        MyThread4 t2=new MyThread4(customTaskObject1,"kachhawa");
        t1.start();
        t2.start();
    }

}

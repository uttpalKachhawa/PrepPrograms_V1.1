package ThreadPractice;
/**
 * @author uttpal on May, 2020
 */
public class MyThread3 extends  Thread{

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("child thread");
            }
        }
        catch (Exception ex){
            System.out.println("i got interrrupted");
        }
        super.run();
    }
}

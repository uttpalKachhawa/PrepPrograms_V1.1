package Java8;

/**
 * @author 703238043 on Jul, 2020
 */

interface  Phone{

    void call();
    default void message(){
        System.out.println("sent message");
    }
}


class AnfroidPhone implements Phone{


    @Override
    public void call() {
        System.out.println("Calling");
    }
}


public class DemoInterface {

    public static void main(String[] args) {
        Phone p = new AnfroidPhone();
        p.call();
        p.message();
    }


}

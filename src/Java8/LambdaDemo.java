package Java8;

/**
 * @author uttpal on Jul, 2020
 */

interface  A{

    void show(int i);
   // void show1();
}

/*class B implements A{


    @Override
    public void show() {
        System.out.println("helllo show");
    }
}*/
public class LambdaDemo {

    public static void main(String[] args) {

       /* A a1 = new A() {
            @Override
            public void show() {
                System.out.println("hello");
            }

            @Override
            public void show1() {
                System.out.println("he;lloo");
            }
        };
        a1.show1();
        a1.show();*/

        A a1;
                a1= j-> System.out.println("hello" + j);//It also like a Consumer interface
                a1.show(6);
               // a1.show1();




    }
}

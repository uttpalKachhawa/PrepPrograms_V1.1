package GC;

/**
 * @author uttpal on Apr, 2020
 */
public class Test {
    public static void main(String args[]){
        String s=new String("bhaskar");
        Test t=new Test();
        t=null;
        System.gc();
        System.out.println("End of main.");
    }
    public void finalize(){
        System.out.println("finalize() method is executed");
    }
}

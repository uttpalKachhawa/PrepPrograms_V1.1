package patterns;

/**
 * @author 703238043 on Apr, 2020
 */
public class MyClientSingleTon {
    public static void main(String[] args) {
      SingleTonPattern singleTonPattern=SingleTonPattern.getInstance();
      System.out.println(singleTonPattern.hashCode());

      SingleTonPattern singleTonPattern1=SingleTonPattern.getInstance();
      System.out.println(singleTonPattern1.hashCode());


    }
}


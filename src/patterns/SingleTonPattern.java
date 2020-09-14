package patterns;

import java.io.Serializable;

/**
 * @author uttpal on Apr, 2020
 */
public class SingleTonPattern implements Serializable {

    private static volatile SingleTonPattern singleTonPattern=null;

    private SingleTonPattern(){
        System.out.println("From Constructor");
    }


    public static  SingleTonPattern getInstance() {
        if (singleTonPattern == null) {
            synchronized (SingleTonPattern.class) {
                if (singleTonPattern == null) {
                    singleTonPattern = new SingleTonPattern();
                }

            }
        }
        return  singleTonPattern;
    }



}

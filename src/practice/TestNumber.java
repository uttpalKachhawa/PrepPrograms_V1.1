package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author uttpal on Aug, 2020
 */
public class TestNumber {

    public static void main(String[] args) {
        int[] num = {54, 546, 548, 60};

        String str[]=new String[num.length];

        for(int i=0;i<num.length;i++){
            str[i]=String.valueOf(num[i]);
            System.out.println(Arrays.toString(str));


        }



    }

}

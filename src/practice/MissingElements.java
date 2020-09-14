package practice;

import java.util.Arrays;

/**
 * @author uttpal on Apr, 2020
 */
public class MissingElements {

    public static void main(String[] args) {
        int a[] = {3, 1, 7, 8, 9, 10, 20, 40, 100};

        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {

        System.out.println(a[i]);
        }

      for(int j=1;j<=100;j++){
        if(count<j && j==a[count])
        {
        count++;
        }
        else
        {
            System.out.print(j+" ");
        }

      }

    }
}

package concepts.oops;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution1 {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Set set =new HashSet();
        int pairs=0;

        for(int i=0;i<ar.length;i++){
            if(!set.contains(ar[i])){
                set.add(ar[i]);
            }else
            {
                pairs++;
                set.remove(ar[i]);
            }

        }

        return pairs;


    }

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int ar[]={1,1,3,1,2,1,3,3,3,3};
            int n=ar.length;
        int result = sockMerchant(n, ar);

        System.out.println(result);
     //   bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        //bufferedWriter.close();


    }
}

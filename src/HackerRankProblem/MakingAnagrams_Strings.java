package HackerRankProblem;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author uttpal on Sep, 2020
 */
public class MakingAnagrams_Strings {

    public static int NUMBER_LETTERS=26;

    public static int getDelta(int[] array1,int[] array2){
        if(array1.length!=array2.length){
            return -1;
        }

        int delta=0;
        for(int i=0;i<array1.length;i++){
            int difference=Math.abs(array1[i]-array2[i]);
            delta +=difference;

        }

        return delta;
    }


   public  static int[] getCharCounts(String s){
       int[] charCounts= new int[NUMBER_LETTERS];
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           int offset=(int)'a';
           int code=c-offset;
           charCounts[code]++;
       }

       return  charCounts;
   }

    static int makeAnagram(String a, String b) {

        int[] charCount1=getCharCounts(a);
        int[] charCount2=getCharCounts(b);

        return  getDelta(charCount1,charCount2);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);

        scanner.close();
    }
}

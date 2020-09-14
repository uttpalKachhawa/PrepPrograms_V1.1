package HackerRankProblem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author uttpal on Sep, 2020
 */
public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        char ch[]=s.toCharArray();

        int count=0;
        int altitude=0;
        for(char c:ch){
            //Step Up
            if(c=='U'){
                if(altitude==-1){
                    count++;
                }
                altitude++;
            }
            else
            {
                altitude--;
            }
        }

        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);

        scanner.close();
    }
}

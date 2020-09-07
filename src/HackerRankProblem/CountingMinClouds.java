package HackerRankProblem;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 703238043 on Sep, 2020
 */
public class CountingMinClouds {
    static int jumpingOnClouds(int[] c) {
        int count = -1;
        for (int i = 0; i < c.length; i++,count++) {
             if (i + 2 < c.length && c[i + 2] == 0)
                i++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

        scanner.close();
    }
}

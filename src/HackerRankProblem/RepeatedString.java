package HackerRankProblem;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author uttpal on Sep, 2020
 */
public class RepeatedString {
    static long repeatedString(String s, long n) {

        long num = n / s.length();
        long rem = n % s.length();
        System.out.println(num);
        System.out.println(rem);
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                ans += num;
                if (i < rem) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println("String contains count of a is " + result);

        scanner.close();
    }
}

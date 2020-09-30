package HackerRankProblem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author uttpal on Sep, 2020
 */
public class SpecialStringAgain {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            counter++;

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(i) != s.charAt(j)) {//aabaaaaa

                    if (2 * j - i < s.length() && s.substring(i, j).
                            equals(s.substring(j + 1, 2 * j - i + 1))) {
                        counter++;
                        break;
                    } else {
                        break;
                    }

                } else {
                    counter++;
                }
            }
        }

        return counter;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);
        System.out.println(result);

        scanner.close();
    }
}

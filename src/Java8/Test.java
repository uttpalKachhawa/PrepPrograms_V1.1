package Java8;

/**
 * @author 703238043 on Jul, 2020
 */
public class Test {


    public static void main(String[] args) {

        int aa = maxScore("acdapmpomp");
        System.out.println("aa = " + aa);
    }

    public static int maxScore(String s) {
        int n = s.length();
        int res = 0;
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) dp[i][j] = 2 + dp[i - 1][j + 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j + 1]);
            }
        }
        for (int i = 1; i < n - 1; i++) {
            res = Math.max(res, dp[n - 1][i] * dp[i - 1][0]);
        }
        //System.out.println(res);
        return res;
    }




}

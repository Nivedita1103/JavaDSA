import java.util.*;

public class solu {
    public static void main(String[] args) {
        int[] A = {1, 5, 2};
        boolean result = canSeetaWin(A);
        System.out.println(result);
    }

    public static boolean canSeetaWin(int[] A) {
        int n = A.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = A[i];
        }

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Math.max(A[i] - dp[i + 1][j], A[j] - dp[i][j - 1]);
            }
        }

        return dp[0][n - 1] >= 0;
    }
}
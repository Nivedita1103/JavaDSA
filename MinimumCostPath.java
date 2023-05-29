import java.util.*;
public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] dp = new int[n][m];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }
            dp[0][0] = 0;
            for (int j = 1; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    for (int k = 0; k < n; k++) {
                        if (i != k) {
                            dp[i][j] = Math.min(dp[i][j], dp[k][j - 1] + Math.abs(a[i][j] - a[k][j - 1]));
                        }
                    }
                }
            }
            int minCost = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                minCost = Math.min(minCost, dp[i][m - 1]);
            }
            System.out.println(minCost);
        }
    }
}
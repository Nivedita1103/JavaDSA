import java.util.Scanner;

public class Bandwidthcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] bandwidth = new int[n];
        for (int i = 0; i < n; i++) {
            bandwidth[i] = scanner.nextInt();
        }

        int[] request = new int[n];
        for (int i = 0; i < n; i++) {
            request[i] = scanner.nextInt();
        }

        int totalBandwidth = scanner.nextInt();
        int result = getMaxRequests(bandwidth, request, totalBandwidth);
        System.out.println(result);
    }

    public static int getMaxRequests(int[] bandwidth, int[] request, int totalBandwidth) {
        int n = bandwidth.length;
        int[][] dp = new int[n + 1][totalBandwidth + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= totalBandwidth; j++) {
                dp[i][j] = dp[i - 1][j]; 
                if (j >= bandwidth[i - 1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - bandwidth[i - 1]] + request[i - 1]);
                }
            }
        }

        return dp[n][totalBandwidth];
    }
}
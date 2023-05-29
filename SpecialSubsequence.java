import java.util.*;

public class SpecialSubsequence {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = sc.nextInt(); // Length of the string
            int K = sc.nextInt(); // Length of special subsequence
            sc.nextLine(); // Consume the newline character

            String S = sc.nextLine(); // Input string

            int[] lastOccurrence = new int[26];
            Arrays.fill(lastOccurrence, -1);

            long[][] dp = new long[N + 1][K + 1];

            // Initialize dp table
            for (int i = 0; i <= N; i++) {
                dp[i][0] = 1;
            }

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= K; j++) {
                    int currentCharacter = S.charAt(i - 1) - 'a';
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1] * (i - 1 - lastOccurrence[currentCharacter])) % MOD;
                    lastOccurrence[currentCharacter] = i - 1;
                }
            }

            System.out.println(dp[N][K]);
        }
    }
}

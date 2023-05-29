import java.util.*;

public class MagicalPotion {

    public static void main(String[] args) {
        // Get the number of ingredients and the target mystical value.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();

        // Initialize the dp array.
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // Set the base case.
        dp[0][0] = 0;

        // Iterate over the ingredients.
        for (int i = 1; i <= n; i++) {
            // Get the mystical value of the current ingredient.
            int mysticalValue = scanner.nextInt();

            // Iterate over the mystical values.
            for (int j = 1; j <= target; j++) {
                // If the current mystical value is greater than or equal to the mystical value of the current ingredient,
                // then we can use the current ingredient to reach the current mystical value.
                if (j >= mysticalValue) {
                    // Update the minimum number of ingredients required to reach the current mystical value.
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - mysticalValue] + 1);
                }
            }
        }
        System.out.println(dp[n][target]);
    }
}
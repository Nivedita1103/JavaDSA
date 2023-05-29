import java.util.*;
public class MaxOrSum {
    public static int maxOrSum(int[] arr, int k) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= k; i++) {
            int s;
            if (i == 1) {
                s = arr[0] * 2;
            } else {
                s = arr[0];
            }
            for (int j = 2; j <= n; j++) {
                if (i == j) {
                    s = s | (arr[j - 1] * 2);
                } else {
                    s = s | arr[j - 1];
                }
            }
            ans = Math.max(ans, s);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12,9};
        int k = 1;
        System.out.println(maxOrSum(arr, k)); // Output: 7
    }
}
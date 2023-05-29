import java.util.Arrays;

public class MaximalPermutation {
    public static int[] maximalPermutation(int n, int m, int[] container, int[] firstPosition, int[] secondPosition, int[] slides) {
        int[] result = new int[n];
        Arrays.sort(container);

        int[] slideDeltas = new int[m];
        for (int i = 0; i < slides.length; i++) {
            slideDeltas[firstPosition[i]] -= slides[i];
            slideDeltas[secondPosition[i]] += slides[i];
        }

        int[] slidePrefixSum = new int[m];
        slidePrefixSum[0] = slideDeltas[0];
        for (int i = 1; i < m; i++) {
            slidePrefixSum[i] = slidePrefixSum[i - 1] + slideDeltas[i];
        }

        for (int i = 0; i < n; i++) {
            int newIndex = (i - slidePrefixSum[i % m] + m) % m;
            result[newIndex] = container[n - i - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[] container = {4, 2, 2, 3};
        int[] firstPosition = {1, 0, 2, 3};
        int[] secondPosition = {2, 1, 3, 0};
        int[] slides = {3, 1, 2, 4};

        int[] result = maximalPermutation(n, m, container, firstPosition, secondPosition, slides);

        for (int num : result) {
            System.out.println(num);
        }
    }
}

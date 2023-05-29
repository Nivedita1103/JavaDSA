public class ques {

    public static boolean isFriendTellingTruth(int N, int[] P, int M) {
        return backtrack(0, 0, N, P, M);
    }

    private static boolean backtrack(int index, int totalMoney, int N, int[] P, int M) {
        if (totalMoney == M) {
            return true;
        }
        if (index == N) {
            return false;
        }

        // Try answering the current question correctly and incorrectly
        return backtrack(index + 1, totalMoney + P[index], N, P, M) ||
                backtrack(index + 1, totalMoney, N, P, M);
    }

    public static void main(String[] args) {
        // Test case 1
        int N1 = 4;
        int[] P1 = {10, 20, 30, 50};
        int M1 = 110;
        System.out.println(isFriendTellingTruth(N1, P1, M1));  // Output: true

        // Test case 2
        int N2 = 5;
        int[] P2 = {10, 20, 30, 1000, 40};
        int M2 = 1000;
        System.out.println(isFriendTellingTruth(N2, P2, M2));  // Output: false
    }
}
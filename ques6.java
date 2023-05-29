import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int X = findMinimumDivisibleInteger(N);
        System.out.println(X);
    }

    public static int findMinimumDivisibleInteger(int N) {
        for (int X = N + 1; ; X++) {
            if (sumOfDigits(X) == N) {
                return X;
            }
        }
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


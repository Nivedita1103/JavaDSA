import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        
        int result = numberGame(number);
        System.out.println((result - 1));
    }

    public static int numberGame(int[] number) {
        Set<Integer> distinctNumbers = new HashSet<>();
        Arrays.sort(number);
        
        int n = number.length;
        int maxDistinct = 0;
        int i = 0;
        while (i < n) {
            int min = number[i];
            int max = number[n - 1];
            distinctNumbers.add(min);
            distinctNumbers.add(max);
            maxDistinct += 2;
            i += 3;
            n -= 3;
        }
        
        int remaining = n % 3;
        if (remaining == 1) {
            distinctNumbers.add(number[n]);
            maxDistinct++;
        } else if (remaining == 2) {
            distinctNumbers.add(number[n]);
            distinctNumbers.add(number[n + 1]);
            maxDistinct += 2;
        }
        
        return maxDistinct;
    }
}

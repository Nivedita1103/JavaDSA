

import java.util.Scanner;

public class quessaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string S: ");
        String S = scanner.nextLine();
        scanner.close();

        int result = minimumTotalCost(S);
        System.out.println(result);
    }

    public static int minimumTotalCost(String S) {
        int n = S.length();
        int totalCost = 0;

        // Find the number of upper and lower case letters in the string
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (int i = 0; i < n; i++) {
            char c = S.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }

        // If the number of uppercase and lowercase letters is not even, return -1
        if (uppercaseCount != lowercaseCount) {
            return -1;
        }

        // Calculate the minimum cost for each letter based on its distance from the middle
        for (int i = 0; i < n / 2; i++) {
            char c = S.charAt(i);
            char desiredChar = S.charAt(i + n / 2);
            if (c != desiredChar) {
                totalCost += Math.abs(desiredChar - c);
            }
        }

        return totalCost;
    }
}

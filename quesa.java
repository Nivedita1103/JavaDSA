import java.util.Scanner;

public class quesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int result = calculateMinimumCost(S);
        System.out.println(result);
    }

    public static int calculateMinimumCost(String S) {
        int[] upperCaseCount = new int[26];
        int[] lowerCaseCount = new int[26];

        for (char ch : S.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount[ch - 'A']++;
            } else {
                lowerCaseCount[ch - 'a']++;
            }
        }

        int halfLen = S.length() / 2;
        int totalCost = 0;

        for (int i = 0; i < 26; i++) {
            int upperOccurrences = upperCaseCount[i];
            int lowerOccurrences = lowerCaseCount[i];

            totalCost += (Math.abs(upperOccurrences - halfLen) + Math.abs(lowerOccurrences - halfLen)) * (i + 'A');
        }

        return totalCost; // Total cost for forming the Melody String
    }
}


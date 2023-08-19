import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String input2 = scanner.nextLine();
        scanner.close();

        String result = areAnagrams(input1, input2) ? "yes" : "no";
        System.out.println(result);
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

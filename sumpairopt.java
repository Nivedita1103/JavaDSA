import java.util.*;

public class sumpairopt {
    public static void main(String args[]) {
        int[] arr = { 2, 7, 5, 13, 15, 4, 0 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum");
        int target = sc.nextInt();

        Arrays.sort(arr); // Sort the array

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println(i + "," + left + "," + right);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}

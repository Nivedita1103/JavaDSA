import java.util.Arrays;
import java.util.Scanner;

public class arraypair {
    // static void func(int[] arr, int n) {
    //     Arrays.sort(arr);
    //     System.out.println(Arrays.toString(arr));
    //     int left = 0;
    //     int right = n - 1;
    //     for (int i = 0; i < n/2; i++) {
    //         left = arr[i];
    //         right = arr[n - i - 1];
    //         System.out.println("(" + left + "," + right + ")");
    //         left++;
    //         right++;
    //     }

    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //     func(arr, n);
    // }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr= new int[n];
	    for(int i =0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int left =0;
	    int right = n-1;
		while(left<right){
		    System.out.println(arr[left]+ " " + arr[right]);
		    left++;
		    right--;
		}
		if(n%2!=0){
		    System.out.println("0"+ " " + arr[n/2]);
		}
	}
}
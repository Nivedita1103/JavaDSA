import java.util.*;

public class arrayip{
    public static void main(String[] args) {
        //Input statements
        // Scanner sc= new Scanner(System.in);
        // //array
        // int n= sc.nextInt();
        // int arr[] = new int [n];
        // for (int i=0; i<n; i++){
        //     arr[i]= sc.nextInt();
        // }
        int[] arr = new int[] { 3, 5, 2, 5, 14, 4 };
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = 65;
        System.out.println(arr);
}
}

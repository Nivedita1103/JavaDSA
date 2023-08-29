import java.util.*;
public class equilibrium {
    public static int point(int[] arr, int total, int n){
        int ans = 0;
        int left = 0;
        for(int j=0; j<n;j++){
            int right = total - left - arr[j];
            if(left == right){
                ans = j;
            }
            
            left = left + arr[j];
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total =0;
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        System.out.println(point(arr, total, n));
    }
}
import java.util.*;

public class SmallLargeSum {
    public static int Sum(int[] arr, int n){
        int[] eve = new int[n];
        int[] odd = new int[n];
        int size = eve.length;
        int eve_index = 0;
        int odd_index = 0;
        if(n==0||n==1){
            return 0;
        }else{
        for(int j =0; j<n; j++){
            
            if(j%2 ==0){
                eve[eve_index] = arr[j];
                eve_index++;
            }else{
                odd[odd_index] = arr[j];
                odd_index++;
            }
            
        }}
        Arrays.sort(eve);
        Arrays.sort(odd);
        int a = eve[size - 2];
        int b = odd[size - 2];
        int sum = a+b;

        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum(arr, n));
    }
}
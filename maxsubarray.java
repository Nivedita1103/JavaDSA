import java.util.*;
public class maxsubarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(func(n, arr));
    }
    public static int func(int n, int[] arr){
        int sum =0;
        int max=0;
        for(int i=0; i<n;i++){
            sum= sum * arr[i];
            if((sum+arr[i]>max)){
                max=sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    
}

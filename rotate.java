import java.util.*;

public class rotate{

    static void Swap(int arr[], int A, int B, int d)
    {
        int temp;
        for (int i=A; i<d;i++){
            temp= arr[A+i];
            arr[A+i]= arr[B+i];
            arr[B+i]= temp;

        }
    }

    static void rotate(int arr[] , int i, int d, int n){
        if(d<n-d){
            Swap(arr,i,n-d,d);
            rotate(arr,i,d,n-d);
        }
        else{
            Swap(arr, i ,d,n-d);
            rotate(arr, n-d, (2*d)-n,d);
        }
    }

    public static void main(String[] args) {
        //Input statements
        Scanner sc= new Scanner(System.in);
        //array
        int n= sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //rotation block d
        int d= sc.nextInt();
    }
}
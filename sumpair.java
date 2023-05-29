import java.util.*;
public class sumpair{
    public static void main(String args[]){
        int[] arr = {2, 7, 5, 13, 15, 4,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                for (int k=2;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println(i +","+ j +","+ k);
                    } 
                }
            }
           
        }
    }
}
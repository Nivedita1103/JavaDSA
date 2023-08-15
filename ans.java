import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ans{
    public static void main(String[] args) {
        //Input statements
        Scanner sc= new Scanner(System.in);
        //array
        int n= sc.nextInt();
        
        String[] arr = new String[n] ;
        for (int i=0; i<n; i++){
            arr[i]= sc.nextLine();
        }
        String joined2 = String.join(arr);
        System.out.println(joined2);
}}

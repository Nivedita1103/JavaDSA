import java.util.Arrays;
import java.util.Scanner;

public class ArrayIP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //input size of array
        int size= sc.nextInt();

        //initialize
        int num[] = new int [size];

        //input elements of array
        for (int i=0; i<size; i++){
            num[i]= sc.nextInt();
        }

        //print array in 1 line
        System.out.println(Arrays.toString(num));

        //print array with 1 element in each line
        for (int i=0; i<size; i++){
            System.out.println(num[i]);
        }
    }
}
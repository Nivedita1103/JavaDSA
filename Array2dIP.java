import java.util.Arrays;
import java.util.Scanner;

public class Array2dIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input size of 2D array
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //initialize
        int[][] num = new int[rows][cols];

        //input elements of array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        //print array in 1 line
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

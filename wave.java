//print array elements in wave form
import java.util.*;

public class wave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] num = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<cols;i++){
            if(i%2==0){
                for(int j=0;j<rows;j++){
                    System.out.println(num[j][i]);
                }
            }else{
                for(int j=rows-1;j>=0;j++){
                    System.out.println(num[j][i]);
                }
            }
        }
    }
   
}
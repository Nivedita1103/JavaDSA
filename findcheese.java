import java.util.*;

public class findcheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int array[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                array[i][j] = sc.nextInt();
                
        // System.out.println("Maze ");
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++)
        //         System.out.print(array[i][j] + " ");
        //     System.out.println();
        // }
    }
}

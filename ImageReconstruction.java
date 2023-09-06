
import java.util.*;
public class ImageReconstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        reconstruct(matrix, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reconstruct(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    if (i + 1 < n && matrix[i + 1][j] != -1) {
                        matrix[i][j] = matrix[i + 1][j] * matrix[i + 1][j];
                    } else if (j + 1 < n && matrix[i][j + 1] != -1) {
                        matrix[i][j] = 2 * matrix[i][j + 1];
                    } else if (j - 1 >= 0 && matrix[i][j - 1] != -1) {
                        matrix[i][j] = matrix[i][j - 1] / 2;
                    } else if (i - 1 >= 0 && matrix[i - 1][j] != -1) {
                        matrix[i][j] = matrix[i - 1][j] / 2;
                    }
                }
            }
        }
    }
}
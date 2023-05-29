import java.util.*;

public class PossibleNo {
    static int combo(int n, int m) {
        int result = 0;
        for (int x = n+1; x <= m; x++)
            result += has419(x) ? 1 : 0;

        return result;
    }

    private static boolean has419(int x) {
        int rem;
        while (x > 0) {
            rem = x % 10;
            if (rem == 4 || rem==1 || rem==9)
                return true;
            x = x / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(combo(n, m));
    }
}
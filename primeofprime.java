import java.util.Scanner;

public class primeofprime {
    static int digSum(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }
    static void check(int n, int m){
        for(int i=n; i<=m;i++){
            if(isPrime(i)){
                int x = digSum(i);
                if(isPrime(x)){
                    check(n, m);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        check(n, m);
    }
}

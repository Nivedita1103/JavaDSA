import java.util.Scanner;

public class specialno {
    int s=0;
    int p=0;
    static int getSum(int x)
    {
        int sum = 0;
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }
    static int getProduct(int n)
    {
        int product = 1;
  
        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
  
        return product;
    }
    static void check(int n, int m){
        for(int i=n; i<=m;i++){
            int sum= getSum(i)+ getProduct(i);
            if(sum==i){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        check(n, m);
    }
}

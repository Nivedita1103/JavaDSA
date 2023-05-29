import java.util.Scanner;

public class strongNo {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
        int n= sc.nextInt();
        int sum = 0;
        int temp=n;
        while (n != 0) {
            int d = n % 10;
            n /= 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f *= i;
            }
            sum = sum+f;
    }
    System.out.println(sum);
    if (sum==temp){
        System.out.println("Strong no.");
    }else{
        System.out.println("not strong");
    }
}}

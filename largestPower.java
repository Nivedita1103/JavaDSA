import java.util.Scanner;

public class largestPower {
    public static int Power(int n, int p){
        int count = 0;
        while(n>0){
            n= n/p;
            count+= n;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int p= sc.nextInt();
        System.out.println(Power(n,p));
    }
}

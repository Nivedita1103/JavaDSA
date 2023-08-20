import java.util.Scanner;

public class automorphic {
    static void check(int n){
        int s = n*n;
        if(s%10==n){
            System.out.println("Automorphic");

        }else{
            System.out.println("Not auromorphic");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
}
    
}

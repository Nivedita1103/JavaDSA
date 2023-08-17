import java.util.Scanner;

public class reverseno {

    static void reverse(int n){
        int a,b,c;
        a= n/100;
        b=(n%100)/10;
        c= n%10;
        System.out.println((c*100)+(b*10)+a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
}
}

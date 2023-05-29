import java.util.*;
public class series {
    static void checkseries(int n){
        int k = 2;
        for(int i=1;i<n;i++){
            System.out.println((k*(2*k-1))+ " ");
            k+=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkseries(n);
    }
}

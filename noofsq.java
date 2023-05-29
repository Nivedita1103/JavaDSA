import java.util.*;
public class noofsq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n*(n+1)*(2*n+1)/6;
        System.out.println(ans);
    }
}
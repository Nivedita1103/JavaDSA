import java.util.Scanner;

public class primeFactorial {
    public static boolean prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }if(c==2){
            return true;
        }else{
            return false;
        }
    }

    public static void factorial(int n){
        int f =1;
        if (prime(n)==true){
            for(int i=1;i<=n;i++){
                f=f*i;
            }
            System.out.println(f);
        }else{
            System.out.println(n);
        }
    }

    public static void range(int n){
        for(int i=1;i<=n;i++){
            factorial(i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        range(n);
    }    
}
//Time complexity: O(n^2)                                                 
import java.util.Scanner;

public class handshakes
{
    static float sumOfAP(float a, float d, float n)
    {
        if(n<=0){
            return 0;
        }else{
            float sum = (n / 2) * (2 * a + (n - 1) * d);
            return sum;
        }
        
    }

    public static void main (String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d= -1;
        int a = n-1;
        System.out.print(sumOfAP(a, d, n));
    }
}

import java.util.*;
public class primeNear {
    public static boolean isPrime(int n){
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
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number whose nearest prime is to be found.");
        int num=s.nextInt();
        int diff1=0,diff2=0;
        int num1=0,num2=0;
        for(int i=num;;i++)
        {
            if(isPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }
        }
        for(int i=num;;i--)
        {
            if(isPrime(i))
            {
                diff2=num-i;
                num2=i;
                break;
            }
        }
        if(diff1<diff2)
            System.out.println(num1);
        else if(diff2<diff1)
            System.out.println(num2);
        else
            System.out.println(num2+" "+num1);
    }
}

import java.util.*;
public class replacenum {
    static int replace(int n)
	{
        int res =0;
        int i=0;
        while(n>0){
		int r=n%10;
        res= (int) (res + (9-r) * Math.pow(10,i++));
        n = n/10;}
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(replace(n));
    }
}

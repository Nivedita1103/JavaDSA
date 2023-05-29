import java.util.*;
public class sumdig {
	
	static int digSum(int n)
	{
		int sum = 0;
		while (n > 0 || sum > 9)
		{
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
			System.out.println(n);
		}
		return sum;
	}
	public static void main(String argc[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
        int n= sc.nextInt();
		System.out.println(digSum(n));
	}
}
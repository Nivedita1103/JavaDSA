import java.util.Scanner;

class katadrome{

static boolean isKatadrome(int num)
{
	int prev = -1;
	while (num > 0)
	{
		int digit = num % 10;
		num /= 10;
		if (digit < prev)
			return false;
		prev = digit;
	}
	return true;
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	if (isKatadrome(N))
		System.out.print("Yes");
	else
		System.out.print("No");
}
}


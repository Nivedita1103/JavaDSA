import java.util.Scanner;
public class Hsq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side");
		int row = sc.nextInt();
		int col = row;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) 
				if((i==1 || i==col) || (j==1 || j==col))
					System.out.print("* ");
				else
					System.out.print("  ");
			
			System.out.println();
			
		}
	}
}

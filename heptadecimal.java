import java.util.Scanner;

public class heptadecimal {
    static int convert(String num, int n) {
        int len = num.length();
        int base = 1;
        int dec = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) >= '0' && num.charAt(i) <= '9') {
                dec += (num.charAt(i) - 48) * base;
                base = base * n;
            } else if (num.charAt(i) >= 'A' && num.charAt(i) <= 'F') {
                dec += (num.charAt(i) - 55) * base;
                base = base * n;
            }
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Num = sc.nextLine();
        int n= sc.nextInt();
        System.out.println(convert(Num,n));
    }
}


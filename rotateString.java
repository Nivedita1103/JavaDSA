import java.util.Scanner;

public class rotateString {
static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
 
    // function that rotates s towards right by d
    static String rightrotate(String str, int d)
    {
        return leftrotate(str, str.length() - d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int n = sc.nextInt();
        String d= sc.next();

        if (d=="L"){
            System.out.println(leftrotate(str, n));
        }else{
            System.out.println(rightrotate(str, n));
        }
    }
}

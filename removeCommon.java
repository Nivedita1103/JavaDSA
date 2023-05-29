import java.util.Scanner;

public class removeCommon {
    public static void Check(String s1, String s2){
        String s3="";
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(i) != s1.charAt(j)) {
                    s3 += s1.charAt(i);
                }
                break;
            }
        }
        System.out.println(s3);
    }


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        Check(s1, s2);
    }
}

import java.util.Scanner;

public class repeat {
    public static void Check(String br){
        char ch[]= br.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                for (int j = 0; j < ch[i]-'0'; j++) {
                    System.out.print(ch[i-1]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String br= sc.nextLine();
        Check(br);
    }
}
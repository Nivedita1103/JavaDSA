import java.util.Scanner;

public class trendy {
    static void check(int n){
        String a = Integer.toString(n);
        if(a.length()==3){
            int b = (n / 10) % 10;
            if(b%3==0){
                System.out.println("Trendy");
            }else{
                System.out.println("not Trendy");
            } 
        }else{
            System.out.println("not trendy");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
}
    
}

import java.util.*;
public class repeatCount {
    static String compress(String s){
        String ans="";
        int count=1;
        for(int i=1; i<=s.length(); ++i){
            if(i==s.length() || s.charAt(i)!=s.charAt(i-1)){
                ans += s.charAt(i-1) + Integer.toString(count);
                count =1;
            }else{
                count++;
            }
            
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.print(compress(s));
    }
}
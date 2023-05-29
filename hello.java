import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class hello {
    static void func(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s.charAt(i) != '-') {
                st1.push(ch);
            }else{
                st2.push(ch);}
        }
        String st1Str = st1.stream().map(st -> st.toString()).collect(Collectors.joining(""));
        String st2Str = st2.stream().map(st -> st.toString()).collect(Collectors.joining(""));
        System.out.println(st2Str+st1Str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        func(s);
    }
}

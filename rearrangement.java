import java.util.Scanner;

public class rearrangement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();

        if(s1.length()==s2.length()){
            int c1=0;
            int c2=0;
            int c3=0;
            int c4=0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==0){
                    c1=c1+1;
                }else if(s1.charAt(i)==1){
                    c2=c2+1;
                }
            }
            for(int j =0;j<s2.length();j++){
                if(s2.charAt(j)==0){
                    c3=c3+1;
                }else if(s2.charAt(j)==1){
                    c4=c4+1;
                }
            }
            if(c1==c3 && c2==c4){
                System.out.println("possible");
            }else if (c1!=c3 || c2!=c4){
                System.out.println("Not possible");
            }

        }else{
            System.out.println("Unequal strings");
        }
    }
    
}

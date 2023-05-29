// public class pattern {

//     static void pattern(String str){
//         for(int i=0; i<str.length();i++){

//         }
//     }
//     public static void main(String[] args) {
//         String str = "Hello";
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//     }
// }

// public class pattern {
//     public static void main(String[] args) {
//         String pattern = "hello";
//         for (int i = 0; i < pattern.length(); i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println(pattern.charAt(i));
//         }
//         int n = pattern.length();
//         for (int k = n; k < 0; k--) {
//                 for (int l = 0; k < l; l--) {
//                     System.out.print(" ");
//                 }
//                 System.out.println(pattern.charAt(k));
//             }
//     }
// }

public class pattern{
    public static void main(String[] args) {
        String str= "Hello";
        int l = str.length();
        for(int i =0; i<l; i++){
            for(int j=0; j<l;j++){
                if(j==i || i+j==l-1){
                    System.out.print(str.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
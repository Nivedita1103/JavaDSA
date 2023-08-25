import java.util.*;

public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int choice = sc.nextInt();
        String cst = "";
        
        if (choice == 1) {
            cst = camelCase(inputString);
        } else if (choice == 2) {
            cst = kebabCase(inputString);
        } else if (choice == 3) {
            cst = snakeCase(inputString);
        } else if (choice == 4) {
            cst = pascalCase(inputString);
        } 
        System.out.println(cst);
    }
    
    public static String camelCase(String input) {
        String[] words = input.split("\\s+|_|-");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (i == 0) {
                result.append(word.toLowerCase());
            } else {
                result.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
            }
        }
        
        return result.toString();
    }
    
    public static String kebabCase(String input) {
        return input.replaceAll("\\s+", "-").toLowerCase();
    }
    
    public static String snakeCase(String input) {
        return input.replaceAll("\\s+", "_").toLowerCase();
    }
    
    public static String pascalCase(String input) {
        String[] words = input.split("\\s+|_|-");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
        }
        
        return result.toString();
    }
}

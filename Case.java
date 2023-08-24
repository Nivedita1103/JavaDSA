import java.util.Scanner;

public class Case {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int choice = scanner.nextInt();
        System.out.println(changeCase(inputStr, choice));
    }

    public static String changeCase(String inputStr, int choice) {
        switch (choice) {
            case 1:
                return toCamelCase(inputStr);
            case 2:
                return toKebabCase(inputStr);
            // case 3:
            //     return toSnakeCase(inputStr);
            // case 4:
            //     return toPascalCase(inputStr);
            default:
                return inputStr;
        }
    }

    private static String toCamelCase(String inputStr) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;
        for (char c : inputStr.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (capitalizeNext) {
                    sb.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else {
                capitalizeNext = true;
            }
        }
        return sb.toString();
    }

    private static String toKebabCase(String inputStr) {
        StringBuilder sb = new StringBuilder();
        for (char c : inputStr.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append
            }
        }
    }
}
import java.util.Arrays;

public class glide{
    public static String findLexicographicallySmallestWord(String s, String[] dictionary) {
        String smallestWord = "-1";

        for (String word : dictionary) {
            int i = 0, j = 0;

            while (i < s.length() && j < word.length()) {
                if (s.charAt(i) == word.charAt(j)) {
                    j++;
                }
                i++;
            }

            if (j == word.length()) {
                if (smallestWord.equals("-1") || word.compareTo(smallestWord) < 0) {
                    smallestWord = word;
                }
            }
        }

        return smallestWord;
    }

    public static void main(String[] args) {
        String s = "hgferyjkllkop";
        String[] dictionary = {"coffee", "coding", "happy", "hello", "hop"};

        String result = findLexicographicallySmallestWord(s, dictionary);
        System.out.println("Result: " + result);
    }
}
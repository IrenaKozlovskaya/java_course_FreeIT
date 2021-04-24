package additionalTask_2;

public class TextFormatter {

    public static int countWords(String s) {
        String[] words = s.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        return words.length;
    }

    public static boolean findWordPalindrome(String s) {
        String[] words = s.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        for (String string : words) {
            if (string.length() > 1 && string.equals(new StringBuilder(string).reverse().toString())) {
                return true;

            }
        }
        return false;
    }


}

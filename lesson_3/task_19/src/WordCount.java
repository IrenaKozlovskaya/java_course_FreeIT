import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    /**
     * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
     * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
     * текста также могут быть пробелы, но могут и отсутствовать.
     */
    public static void main(String[] args) {
        int counter = 0;

        String text = " To advertise means     to make information public.";
        Pattern pattern = Pattern.compile("(\\s*)?\\S+(\\s*)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}
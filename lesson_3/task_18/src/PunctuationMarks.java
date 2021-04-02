import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationMarks {
    /**
     * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
     * общее их количество.
     */
    public static void main(String[] args) {
        int count = 0;
        String string = "(...It is clear? that they; celebrate. Christmas, because it's a \"family party\" and a great - opportunity: to be together!)";
        Pattern pattern = Pattern.compile("([\\.\\?\\()\\-\"!:;,' ])");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            count++;
        }
        System.out.println("Found " + count + " punctuation  marks.");
    }
}

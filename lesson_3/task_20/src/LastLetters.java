import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetters {
    /**
     * Имеется строка с текстом. Вывести текст, составленный из последних букв
     * всех слов.
     */
    public static void main(String[] args) {
        String text = "To advertise means  to make, information public.";
        Pattern pattern = Pattern.compile("([a-zA-Z]+)([a-zA-Z])([\\s+\\.,]?)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group(2));
        }


    }
}

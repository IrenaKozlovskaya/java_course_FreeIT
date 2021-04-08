import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexadecimalNumbers {
    /**
     * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
     * записаных по правилам Java, с помощью регулярных выражений и вывести их на
     * страницу.
     */
    public static void main(String[] args) {
        String text = "jhdfkj3-0x6dksn0Ckjo0X5A6fgxftg2bs21AF3";
        Pattern pattern = Pattern.compile("0(x|X)[0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

    }
}

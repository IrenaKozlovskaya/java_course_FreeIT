import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraphs {
    /**
     * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
     * которых есть параметры, например <p id=”p1”>, и замену их на простые теги
     * абзацев <p>.
     */
    public static void main(String[] args) {
        String text = """
                <p>В одних садах цветёт миндаль, в других метёт метель.</p>
                <p style="color:red;">В одних краях ещё февраль, в других - уже апрель.</p>
                <p>Проходит время, вечный счёт: год за год, век за век...</p>
                <p id="p1">Во всём - его неспешный ход, его кромешный бег.</p>
                """;
        Pattern pattern = Pattern.compile("(<p )(.+?>)");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll("<p>"));
    }
}

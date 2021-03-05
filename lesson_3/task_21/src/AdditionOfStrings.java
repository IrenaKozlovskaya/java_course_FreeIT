import java.lang.StringBuilder;
import java.util.Date;

public class AdditionOfStrings {
    /**
     * Напишите три цикла выполняющих многократное сложение строк, один с
     * помощью оператора сложения и String, другой с помощью StringBuilder и метода
     * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
     */
    public static void main(String[] args) {
        int n = 10000;
        Date date = new Date();
        long startTime = date.getTime();

        String string = "";
        for (int i = 0; i < n; i++) {
            string += "addition";
        }
        Date dateString = new Date();
        System.out.println(dateString.getTime() - startTime);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("addition");
        }
        Date dateStringBuilder = new Date();
        System.out.println(dateStringBuilder.getTime() - dateString.getTime());

        StringBuffer stringBuff = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuff.append("addition");
        }
        Date dateStringBuffer = new Date();
        System.out.println(dateStringBuffer.getTime() - dateStringBuilder.getTime());
    }
}

import java.lang.StringBuilder;

public class AdditionOfStrings {
    /**
     * Напишите три цикла выполняющих многократное сложение строк, один с
     * помощью оператора сложения и String, другой с помощью StringBuilder и метода
     * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
     */
    public static void main(String[] args) {
        int n = 10000;
        long startTime = System.currentTimeMillis();

        String string = "";
        for (int i = 0; i < n; i++) {
            string += "addition";
        }
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("addition");
        }
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();

        StringBuffer stringBuff = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuff.append("addition");
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}

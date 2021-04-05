import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rubles {
    /**
     * Имеется целове число (задать с помощью Random rand = new Random(); int x =
     * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
     * нему слово «рублей» в правильном падеже.
     */
    public static void main(String... arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x % 100 == 11 || x % 100 == -11 || x % 100 == 12 || x % 100 == -12 || x % 100 == 13 || x % 100 == -13 || x % 100 == 14 || x % 100 == -14) {
            System.out.println(x + " рублей");
        } else {
            switch (x % 10) {
                case (1):
                case (-1):
                    System.out.println(x + " рубль");
                    break;
                case (2):
                case (-2):
                case (3):
                case (-3):
                case (4):
                case (-4):
                    System.out.println(x + " рубля");
                    break;
                default:
                    System.out.println(x + " рублей");
            }
        }
    }
}

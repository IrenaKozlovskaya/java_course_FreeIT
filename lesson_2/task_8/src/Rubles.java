import java.util.Random;

public class Rubles {
    /**
     *Имеется целове число (задать с помощью Random rand = new Random(); int x =
     * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
     * нему слово «рублей» в правильном падеже.
     */
    public static void main(String... arg) {
        Random rand = new Random();
        int x = rand.nextInt();
        if (x % 10 == 1 || x % 10 == -1) {
            System.out.println(x + " рубль");
        } else if (x % 100 == 12 || x % 100 == -12 || x % 100 == 13 || x % 100 == -13 || x % 100 == 14 || x % 100 == -14) {
            System.out.println(x + " рублей");
        } else if (x % 10 == 2 || x % 10 == -2 || x % 10 == 3 || x % 10 == -3 || x % 10 == 4 || x % 10 == -4) {
            System.out.println(x + " рубля");
        } else {
            System.out.println(x + " рублей");
        }
    }
}

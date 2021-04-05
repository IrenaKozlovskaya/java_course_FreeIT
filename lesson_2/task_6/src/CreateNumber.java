import java.util.Random;

public class CreateNumber {
    /**
     * Создайте число. Определите, является ли число трехзначным. Определите, является
     * ли его последняя цифра семеркой. Определите, является ли число четным.
     */
    public static void main(String... arg) {
        int number = (int) (Math.random() * 1000);
        String s = Integer.toString(number);
        System.out.println(number);
        if (s.length() == 3) {
            System.out.println("This is a three-digit number");
        }
        if (number % 10 == 7) {
            System.out.println("The last digit is 7");
        }
        if (number % 2 == 0) {
            System.out.println("This number is even");
        }


    }
}

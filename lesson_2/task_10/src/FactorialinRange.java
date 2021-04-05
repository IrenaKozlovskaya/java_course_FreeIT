public class FactorialinRange {
    /**
     * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
     */
    public static void main(String... arg) {
        int factorial = 1;
        int x = (int) (Math.random() * (15 - 10) + 10);
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial + " this is a factorial of the number " + x);
    }
}

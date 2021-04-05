public class Sum {
    /**
     * Найдите сумму первых n целых чисел, которые делятся на 3.
     */
    public static void main(String... arg) {
        int sum = 0;
        int n = 3;
        for (int i = 1; i <= n; i++) {
            sum += i * 3;
        }
        System.out.println("The sum of the first " + n + " numbers is " + sum);
    }
}

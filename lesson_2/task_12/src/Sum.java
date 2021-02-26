public class Sum {
    /**
     * Найдите сумму первых n целых чисел, которые делятся на 3.
     */
    public static void main(String... arg) {
        int sum = 0;
        int numbers = 0;
        int n = (int) (Math.random() * 10);
        for (int i = 0; i < n; i++) {
            while (true) {
                numbers = (int) (Math.random() * 100);
                if (numbers % 3 == 0) {
                    System.out.println(numbers);
                    break;
                }
            }
            sum += numbers;
        }
        System.out.println("The sum of the first " + n + " numbers is " + sum);
    }
}

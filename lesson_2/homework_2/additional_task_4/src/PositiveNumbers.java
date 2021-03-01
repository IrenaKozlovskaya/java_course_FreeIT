public class PositiveNumbers {
    /**
     * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
     */

    public static void main(String[] args) {
        int positive = 0;
        for (int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * 21) - 10;
            System.out.println(a);
            if (a > 0) {
                positive++;
            }
        }
        System.out.println(positive + " positive numbers");
    }
}

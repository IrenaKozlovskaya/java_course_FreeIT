public class ExceptZero {
    /**
     * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
     */
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 21) - 10;
            System.out.println(number);
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }
        System.out.println(positive + " positive numbers and " + negative + " negative numbers");
    }
}

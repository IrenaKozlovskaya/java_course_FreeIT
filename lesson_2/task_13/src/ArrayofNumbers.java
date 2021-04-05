public class ArrayofNumbers {
    /**
     * Создать последовательность случайных чисел, найти и вывести наибольшее
     * из них.
     */
    public static void main(String... arg) {
        int minNumber = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int numbers = (int) (Math.random() * 201) - 100;
            System.out.println(numbers);
            if (numbers > minNumber) {
                minNumber = numbers;
            }
        }
        System.out.println(minNumber + " is MAX");
    }
}

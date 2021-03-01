public class ArrayofNumbers {
    /**
     * Создать последовательность случайных чисел, найти и вывести наибольшее
     * из них.
     */
    public static void main(String... arg) {
        int keeper = 0;
        for (int i = 0; i < 10; i++) {
            int numbers = (int) (Math.random() * 100);
            System.out.println(numbers);
            if (numbers > keeper) {
                keeper = numbers;
            }
        }
        System.out.println(keeper + " is MAX");
    }
}

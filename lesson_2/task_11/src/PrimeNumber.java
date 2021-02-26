public class PrimeNumber {
    /**
     * Имеется целое число, определить является ли это число простым, т.е.
     * делится без остатка только на 1 и себя.
     */
    public static void main(String... arg) {
        int count = 0;
        int number = (int) (Math.random() * 100);
        if (number == 0 || number == 1) {
            System.out.println(number + " the number is not prime");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0 && number != i) {
                    System.out.println(number + " the number is not prime");
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(number + " the number is prime");
            }
        }
    }
}

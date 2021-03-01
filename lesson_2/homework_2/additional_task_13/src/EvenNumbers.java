public class EvenNumbers {
    /**
     * Напишите программу вывода всех четных чисел от 2 до 100 включительно
     */
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}


public class Factorial {
    /**
     * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
     * произведение, т.е. факториал числа.
     * <p>
     * <p>
     * double averageSum = 0;
     * double sum = 0;
     * int n = 0;
     * int x = (int)(Math.random() * 20);
     * while(x != 0) {
     * sum += x;
     * n ++;
     * x = (int)(Math.random()*20);
     * }
     * if(n != 0){
     * averageSum = sum / n;
     * } else {
     * averageSum = 0;
     * }
     * System.out.println("среднее:" + averageSum);
     */
    public static void main(String... arg) {
        long factorial = 1;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            for (int i = 1; i <= x; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial + " this is a factorial of the number " + x);
            factorial = 1;
            x = (int) (Math.random() * 20);
        }
    }
}

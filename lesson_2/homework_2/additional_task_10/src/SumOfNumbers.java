public class SumOfNumbers {
    /**
     * Вычислить: 1+2+4+8+...+256
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 257; i *= 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}

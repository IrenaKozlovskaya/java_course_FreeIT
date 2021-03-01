public class Multiplication {
    /**
     * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int result = 0;
        for (int i = a; i > 0; i--) {
            result += b;
        }
        System.out.println(result);
    }
}

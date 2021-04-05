public class Theorem {
    /**
     * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
     * полностью закрыть круглой картонкой радиусом r.
     */
    public static void main(String... arg) {
        int r = 4;       // radius
        int a = 2;       // length
        int b = 6;       // width
        int hypotenuse = (int) Math.sqrt(a * a + b * b);
        int diameter = r * 2;
        if (diameter > hypotenuse) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

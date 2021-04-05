public class Triangle {
    /**
     * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
     * Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
     * Требуется сравнить длину каждого отрезка-стороны с суммой двух других. Если хотя бы в одном случае
     * отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
     */
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        int c = (int) (Math.random() * 10);
        if (a + b > c && a + c > b && c + b > a) {
            System.out.println(a + " " + b + " " + c + " Such a triangle exists");
        } else {
            System.out.println("No such triangle exists");
        }
    }
}

public class Amoeba {
    /**
     * Одноклеточная амеба каждые 3 часа делится на 2 клетки.
     * Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */

    public static void main(String[] args) {
        int cells = 1;
        for (int i = 3; i < 25; i += 3) {
            cells *= 2;
            System.out.println(cells + " cells after " + i + " hours");
        }
    }
}

public class DistanceTable {
    /**
     * Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
     * для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        double centimeters = 2.54;
        for (int j = 1; j < 21; j++) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        for (int i = 1; i < 21; i++) {
            System.out.print(i * centimeters + " ");
        }

    }
}




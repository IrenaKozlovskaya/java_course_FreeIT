public class Sportsman {
    /**
     * Начав тренировки, спортсмен в первый день пробежал 10 км.
     * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
     * Какой суммарный путь пробежит спортсмен за 7 дней?
     */
    public static void main(String[] args) {
        double km = 10;

        for (int i = 0; i < 7; i++) {
            km += km / 100 * 10;
            System.out.printf("%.2f %n", km);
            ;
        }
    }


}

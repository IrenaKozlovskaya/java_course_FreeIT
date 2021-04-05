public class Programmers {
    /**
     * В переменную записываете количество программистов.
     * В зависимости от количества программистов необходимо вывести правильно окончание.
     * Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
     */
    public static void main(String[] args) {
        int programmers = (int) (Math.random() * 100);
        if (programmers % 100 == 11 || programmers % 100 == 12 || programmers % 100 == 13 || programmers % 100 == 14) {
            System.out.println(programmers + " программистов");
        } else {
            switch (programmers % 10) {
                case 1:
                    System.out.println(programmers + " программист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(programmers + " программиста");
                    break;
                default:
                    System.out.println(programmers + " программистов");
                    break;
            }
        }
    }
}

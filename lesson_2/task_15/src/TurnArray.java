public class TurnArray {
    /**
     * Создать массив, заполнить его случайными элементами, распечатать,
     * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
     * еще один массив).
     */
    public static void main(String[] args) {
        int keeper = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println(" ");

        for (int i = 0; i < array.length / 2; i++) {
            keeper = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = keeper;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

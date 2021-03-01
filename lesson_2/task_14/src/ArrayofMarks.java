public class ArrayofMarks {
    /**
     * Создать массив оценок произвольной длины, вывести максимальную и
     * минимальную оценку, её (их) номера.
     */
    public static void main(String... arg) {
        int keeper = 0;
        int[] array = new int[]{1, 5, 10, 8, 9, 4, 2, 7, 6, 3};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[i] > array[i + 1]) {
                    keeper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = keeper;
                }
            }
        }
        System.out.println(array[9]);
        System.out.println(array[0]);
    }
}

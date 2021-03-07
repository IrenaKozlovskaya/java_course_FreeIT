public class ArrayofMarks {
    /**
     * Создать массив оценок произвольной длины, вывести максимальную и
     * минимальную оценку, её (их) номера.
     */
    public static void main(String... arg) {

        int[] array = new int[]{6, -5, 10, 8, 9, 4, 2, -12, 1, 3};
        int maxNumber = 0;
        int minNumber = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[maxNumber] < array[i]) {
                array[maxNumber] = array[i];
                maxNumber = i;
            } else if (array[minNumber] > array[i]) {
                array[minNumber] = array[i];
                minNumber = i;
            }
        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}

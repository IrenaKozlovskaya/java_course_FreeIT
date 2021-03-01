public class SumArray {
    /**
     * Определите сумму элементов одномерного массива, расположенных между
     * минимальным и максимальным значениями.
     */
    public static void main(String[] args) {
        int[] array = new int[]{15, 7, 10, 30, 26, 8, 11, 1, 12, 13, 2};
        int sum = 0;
        int indexMax = 0;
        int indexMin = 0;
        int max = array[array.length - 1];
        int min = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            } else if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
        }
        for (int i = Math.min(indexMax, indexMin) + 1; i < Math.max(indexMax, indexMin); i++) {
            sum += array[i];
        }
        System.out.println(sum);

    }
}

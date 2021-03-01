public class Butterfly {
    /**
     * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
     * таким образом:
     * 1 1 1 1 1
     * 0 1 1 1 0
     * 0 0 1 0 0
     * 0 1 1 1 0
     * 1 1 1 1 1
     */
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= array.length / 2) {
                    if (i <= j && array.length - i > j) {
                        array[i][j] = 1;
                    }
                }
                if (i > array.length / 2) {
                    if (i >= j && array.length - j - 1 <= i) {
                        array[i][j] = 1;
                    }
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}

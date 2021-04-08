public class Solution {
    /**
     * Написать класс, который умеет хранить в себе массив любых типов данных (int, long
     * etc.). Реализовать метод get(int index), который возвращает любой элемент
     * массива по индексу.
     */
    public static void main(String[] args) {
        Array array = new Array(26, "String", new Object(), 3.4);
        System.out.println(array.get(1));

    }
}

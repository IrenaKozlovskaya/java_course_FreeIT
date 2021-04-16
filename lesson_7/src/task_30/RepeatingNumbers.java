package task_30;

import java.util.*;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
 * числа.
 */

public class RepeatingNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < 10) {
            list.add(random.nextInt(10));
        }
        System.out.println(list);

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);


    }
}

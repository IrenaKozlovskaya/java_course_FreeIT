package task_31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */
public class HighestMark {
    public static void main(String[] args) {
        ArrayList<Integer> listOfGrade = new ArrayList<>();
        Random random = new Random();

        while (listOfGrade.size() < 10) {
            listOfGrade.add(random.nextInt(100));
        }
        System.out.println(listOfGrade);

        Iterator<Integer> iterator = listOfGrade.iterator();
        Integer max = 0;

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (max < num) {
                max = num;
            }
        }
        System.out.println(max);

    }
}

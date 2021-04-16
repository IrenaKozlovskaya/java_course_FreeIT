package task_29;

import java.util.ArrayList;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Удалить неудовлетворительные оценки из списка.
 */
public class StudentGradeList {

    public static void main(String[] args) {
        ArrayList<Integer> listOfGrade = new ArrayList<>();
        listOfGrade.add(9);
        listOfGrade.add(4);
        listOfGrade.add(2);
        listOfGrade.add(7);
        listOfGrade.add(3);

        for (int i = listOfGrade.size() - 1; i >= 0; i--) {
            if (listOfGrade.get(i) < 4) {
                listOfGrade.remove(i);
            }
        }
        System.out.println(listOfGrade);
    }


}

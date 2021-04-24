package task_34;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
 * распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
 * распечатать.
 */
public class AlphaNumericTextActions {
    public static void main(String[] args) {
        File file = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\task_34\\textWithNumbers.txt");
        List<Integer> listOfNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher;
        String s;
        int count = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            while (bufferedReader.ready()) {
                s = bufferedReader.readLine();
                matcher = pattern.matcher(s);

                while (matcher.find()) {
                    listOfNumbers.add(Integer.parseInt(matcher.group(0)));
                    count++;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.print("Файл не найден");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }


        System.out.println(listOfNumbers.toString() + " count of numbers - " + count);

        Set<Integer> set = new HashSet<>(listOfNumbers);

        System.out.println(set.toString());

    }

}
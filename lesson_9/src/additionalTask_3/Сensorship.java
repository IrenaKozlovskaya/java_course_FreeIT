package additionalTask_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Проверка на цензуру:
 * Создаете 2 файла.
 * 1 - й. Содержит исходный текст.
 * 2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
 * определите сами, хотите каждое слово на новой строке, хотите через запятую
 * разделяйте, ваша программа делайте как считаете нужным.
 * Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
 * встретилось ни одного недопустимого слова, то выводите сообщение о том что
 * текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
 * сообщение, кол-во предложений не прошедших проверку и сами предложения
 * подлежащие исправлению.
 */
public class Сensorship {

    public static void main(String[] args) {

        File text = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\additionalTask_3\\obsceneText.txt");
        File blackList = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\additionalTask_3\\blackList.txt");
        ArrayList<String> sentencesToChange = new ArrayList<>();
        String s;
        int counter = 0;

        try (BufferedReader textReader = new BufferedReader(new FileReader(text));
             BufferedReader blackListReader = new BufferedReader(new FileReader(blackList))) {

            String[] arrayByWords = blackListReader.readLine().replaceAll(",", "").split(" ");

            while (textReader.ready()) {
                s = textReader.readLine();
                String[] arrayBySentence = s.toLowerCase().split("[.!?]\\s*");

                for (String sentence : arrayBySentence) {
                    for (String blackWord : arrayByWords)
                        if (sentence.contains(blackWord)) {
                            sentencesToChange.add(sentence);
                            counter++;
                        }

                }
                if (counter == 0) {
                    System.out.println("Текст прошел проверку на цензуру");
                } else if (counter > 0) {
                    System.out.println("Текст не прошел проверку на цензуру. \n" +
                            +counter + " предложений не прошло проверку. \n" +
                            "Вот эти предложения нужно исправить:");
                    for (String i : sentencesToChange) {
                        System.out.println(i);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

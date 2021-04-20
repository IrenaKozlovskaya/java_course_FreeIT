package task_33;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
 * препинания и слов.
 */

public class SumOfPunctuationMarksAndWords {
    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\task_33\\text.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {

            int currentByte = fileInputStream.read();
            while (currentByte != -1) {
                stringBuilder.append((char) currentByte);
                currentByte = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }


        countPunctuationMarks(stringBuilder.toString());
        countWords(stringBuilder.toString());

    }

    public static void countPunctuationMarks(String text) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        System.out.println("Found " + count + " punctuation  marks.");
    }

    public static void countWords(String text) {
        text = text.replaceAll("\\p{Punct}", "");
        int count = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        while (stringTokenizer.hasMoreTokens()) {
            count++;
            stringTokenizer.nextToken();
        }
        System.out.println("Found " + count + " words.");
    }
}


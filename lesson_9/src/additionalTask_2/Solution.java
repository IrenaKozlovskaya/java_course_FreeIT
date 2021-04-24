package additionalTask_2;


import java.io.*;

/**
 * Текстовый файл содержит текст. После запуска программы в другой файл
 * должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
 * предложении присутствует слово-палиндром, то не имеет значения какое кол-во
 * слов в предложении, оно попадает в новый файл.
 * Пишем все в ООП стиле. Создаём класс TextFormatter
 * в котором два статических метода:
 * 1. Метод принимает строку и возвращает кол-во слов в строке.
 * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
 * есть возвращает true, если нет false
 * В main считываем файл.
 * Разбиваем текст на предложения. Используя методы класса TextFormatter
 * определяем подходит ли нам предложение. Если подходит добавляем его в
 * новый файл
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\additionalTask_2\\textWithPalindromes.txt");
        File file1 = new File("finalText.txt");
        int counter;
        String[] arrayBySentence;

        boolean created = file1.createNewFile();

        if (created) {

            try (BufferedReader textReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                 BufferedReader bufferedReader = new BufferedReader((new FileReader(file1)))) {

                while (textReader.ready()) {
                    arrayBySentence = textReader.readLine().toLowerCase().split("[.!?]\\s*");

                    for (String sentence : arrayBySentence) {
                        if (TextFormatter.findWordPalindrome(sentence)) {
                            bufferedWriter.write(sentence + "\n");
                        } else {
                            counter = TextFormatter.countWords(sentence);
                            if (counter <= 5 && counter >= 3) {
                                bufferedWriter.write(sentence + "\n");
                            }
                        }
                    }
                }

                textReader.close();
                bufferedWriter.close();

                while (bufferedReader.ready()) {
                    System.out.println(bufferedReader.readLine());
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package additionalTask_1;

import java.io.*;

/**
 * В исходном файле находятся слова, каждое слово на новой строке. После
 * запуска программы должен создать файл, который будет содержать в себе
 * только палиндромы
 */
public class Palindromes {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\additionalTask_1\\palindromes.txt");
        File fileNew = new File("p.txt");
        String s;


        boolean created = fileNew.createNewFile();

        if (created) {

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileNew));
                 BufferedReader bufferedReaderOfNewFile = new BufferedReader(new FileReader(fileNew))) {

                while (bufferedReader.ready()) {
                    s = bufferedReader.readLine();
                    if (s.equals(new StringBuilder(s).reverse().toString())) {
                        bufferedWriter.write(s + "\n");
                    }
                }
                bufferedReader.close();
                bufferedWriter.close();

                while (bufferedReaderOfNewFile.ready()) {
                    s = bufferedReaderOfNewFile.readLine();
                    System.out.println(s);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

package task_35;


import java.io.*;
import java.util.Random;

/**
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
 * распечатать числа и их среднее арифметическое.
 */
public class BinaryFileActions {
    public static void main(String[] args) {

        Random random = new Random();
        File file = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9\\src\\task_35\\binary_file.dat");

        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new
                    FileOutputStream(file)));

            int numbers;
            for (int i = 0; i < 20; i++) {
                numbers = random.nextInt(10);
                dataOutputStream.writeInt(numbers);
            }

            dataOutputStream.close();

            dataInputStream = new DataInputStream((new BufferedInputStream(new FileInputStream(file))));

            int sum = 0;

            while (dataInputStream.available() > 0) {
                numbers = dataInputStream.readInt();
                sum += numbers;

                System.out.print(numbers + " ");
            }
            System.out.println("Среднее арифметическое - " + (double) sum / 20);

            dataInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

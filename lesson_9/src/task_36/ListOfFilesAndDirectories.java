package task_36;

import java.io.File;


/**
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
 * должны быть распечатаны отдельно.
 */
public class ListOfFilesAndDirectories {
    public static void main(String[] args) {

        File file = new File("D:\\Programming\\dev\\java_course_FreeIT\\lesson_9");
        System.out.println("Файлы: ");
        findFile(file);
        System.out.println("Каталоги:");
        findDirectory(file);


    }

    public static void findFile(File file) {
        if (file.isDirectory()) {
            File[] array = file.listFiles();
            for (File f : array) {
                if (f.isFile())
                    System.out.println(f.getName());
            }
        }
    }

    public static void findDirectory(File file) {
        if (file.isDirectory()) {
            File[] array = file.listFiles();
            for (File f : array) {
                if (f.isDirectory())
                    System.out.println(f.getName());
            }
        }
    }
}
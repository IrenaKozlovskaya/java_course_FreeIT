package Library;


import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Application {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String command;
        Library library = new Library();
        Genre genre = new Genre();
        genre.addGenre();
        Comparator<Book> comparator = new BookTitleComparator();

        do {
            System.out.println("""
                    Выберите действие и нажмите "Enter"\s
                    1. Показать все книги\s
                    2. Добавить книгу\s
                    3. Удалить книгу\s
                    4. Редактировать книгу\s
                    5. Выход""");
            command = scanner.nextLine();

            switch (command) {

                case ("1"):
                    System.out.println("""
                            Выберите порядок вывода книг:\s
                            1. По алфавиту (от А до Я)\s
                            2. По алфавиту (от Я до А) \s
                            3. По добавлению (сначала новые, потом старые""");
                    command = scanner.nextLine();

                    switch (command) {
                        case ("1") -> {
                            library.getAllBooks().sort(comparator);
                            System.out.println(library.getAllBooks().toString());
                        }
                        case ("2") -> {
                            library.getAllBooks().sort(Collections.reverseOrder(comparator));
                            System.out.println(library.getAllBooks().toString());
                        }
                        case ("3") -> {
                            Collections.sort(library.getAllBooks(), Comparator.comparingInt(o -> (int) o.getBookTime()));
                            Collections.reverse((library.getAllBooks()));
                            System.out.println(library.getAllBooks().toString());
                        }
                    }
                    break;
                case ("2"):
                    while (true) {
                        System.out.println("Введите Id, название и ID жанра книги.\n" +
                                "Существуют несколько жанров книг: ");
                        genre.getMapOfGenres();
                        try {
                            library.addBook(new Book(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), genre.getGenre(Integer.parseInt(scanner.nextLine()))));
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("ID должно состоять из строк");
                        }
                    }
                    break;
                case ("3"):
                    System.out.println("Введите ID книги, которую хотите удалить");
                    try {
                        library.deleteBook(Integer.parseInt(scanner.nextLine()));
                        System.out.println("Книга удалена!");
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("ID должно состоять из строк");
                    }
                case ("4"):

                    System.out.println("Введите Id книги, измененное название и измененный ID жанра книги.\n" +
                            "Существуют несколько жанров книг: ");
                    genre.getMapOfGenres();
                    try {
                        library.editBook(new Book(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), genre.getGenre(Integer.parseInt(scanner.nextLine()))));
                    } catch (NumberFormatException e) {
                        System.out.println("ID должно состоять из строк");
                    }


            }
        }
        while (!command.equals("5"));
    }
}

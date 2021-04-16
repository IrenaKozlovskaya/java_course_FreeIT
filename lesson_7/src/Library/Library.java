package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {


    List<Book> list = new ArrayList<>();


    public void addBook(Book book) {
        if (!list.contains(book)) {
            list.add(book);
        } else {
            System.out.println("Книга с таким ID уже есть в списке!");
        }
    }

    public List<Book> getAllBooks() {
        return list;
    }


    public void deleteBook(int id) {
        list.removeIf(i -> i.getId() == id);
    }


    public void editBook(Book book) {
        for (Book i : list) {
            if (i.equals(book)) {
                i.setTitle(book.getTitle());
                i.setGenreId(book.getGenreId());
            }
        }

    }
}

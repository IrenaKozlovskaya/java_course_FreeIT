package Library;


import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String genreId;
    private long bookTime;

    public Book(int id, String title, String genreId) {
        this.id = id;
        this.title = title;
        this.genreId = genreId;
        this.bookTime = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public long getBookTime() {
        return bookTime;
    }

    public void setBookTime(long bookTime) {
        this.bookTime = bookTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genreId);
    }


    @Override
    public String toString() {
        return "id = " + id +
                ", название = \"" + title +
                "\", жанр = " + genreId;
    }
}

package Library;

import java.util.HashMap;
import java.util.Map;

public class Genre {
    Map<Integer, GenreTitle> genres = new HashMap<>();

    public void addGenre() {
        genres.put(1, GenreTitle.RAMAN);
        genres.put(2, GenreTitle.FAIRY_TALE);
        genres.put(3, GenreTitle.ADVENTURE);
        genres.put(4, GenreTitle.POETRY);
    }

    public String getGenre(int genreId) {
        if (genres.size() >= genreId) {
            return String.valueOf(genres.get(genreId));
        }
        System.out.println("Жанр книги не установлен");
        return null;
    }

    public void getMapOfGenres() {
        for (Integer i : genres.keySet()) {
            String key = i.toString();
            String value = genres.get(i).toString();
            System.out.println(key + " - " + value);
        }
    }
}

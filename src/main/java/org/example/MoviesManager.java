package org.example;

public class MoviesManager {

    private String[] movies = new String[0];//массив, в котором все фильмы

    private int limit;

    public MoviesManager() {//конструктор
        this.limit = 5;
    }

    public MoviesManager(int limit) {//конструктор
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];//массив на ед. больше старого
        for (int i = 0; i < movies.length; i++) {// копируем из старого в новый
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findAll() {//показ всех добавленных фильмов
        return movies;
    }

    public String[] findLast() {//возвращение последнего фильма
        int resultLenght;
        if (movies.length < 5) {//если фильмов меньше чем лимит
            resultLenght = movies.length;//то сколько есть
        } else {
            resultLenght = 5;//иначе 5
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}




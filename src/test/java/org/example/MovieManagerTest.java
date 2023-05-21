package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test1() {
        MoviesManager manager = new MoviesManager();

        Movie Film1 = new Movie(1, "Бладшот", "боевик");
        Movie Film2 = new Movie(2, "Вперёд", "мультфильм");
        Movie Film3 = new Movie(3, "Джентельмены", "Боевик");

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");


        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MoviesManager manager = new MoviesManager(5);

        Movie Film1 = new Movie(1, "Бладшот", "боевик");
        Movie Film2 = new Movie(2, "Вперёд", "мультфильм");
        Movie Film3 = new Movie(3, "Джентельмены", "Боевик");
        Movie Film4 = new Movie(4, "Отель Белград", "комедия");
        Movie Film5 = new Movie(5, "Человек-Невидимка", "ужасы");

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MoviesManager manager = new MoviesManager(2);

        Movie Film1 = new Movie(1, "Бладшот", "боевик");
        Movie Film2 = new Movie(2, "Вперёд", "мультфильм");
        Movie Film3 = new Movie(3, "Джентельмены", "Боевик");
        Movie Film4 = new Movie(4, "Отель Белград", "комедия");
        Movie Film5 = new Movie(5, "Человек-Невидимка", "ужасы");

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        MoviesManager manager = new MoviesManager(7);

        Movie Film1 = new Movie(1, "Бладшот", "боевик");
        Movie Film2 = new Movie(2, "Вперёд", "мультфильм");
        Movie Film3 = new Movie(3, "Джентельмены", "Боевик");
        Movie Film4 = new Movie(4, "Отель Белград", "комедия");
        Movie Film5 = new Movie(5, "Человек-Невидимка", "ужасы");

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");


        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test5() {
        MoviesManager manager = new MoviesManager(5);

        Movie Film1 = new Movie(1, "Бладшот", "боевик");
        Movie Film2 = new Movie(2, "Вперёд", "мультфильм");
        Movie Film3 = new Movie(3, "Джентельмены", "Боевик");
        Movie Film4 = new Movie(4, "Отель Белград", "комедия");
        Movie Film5 = new Movie(5, "Человек-Невидимка", "ужасы");
        Movie Film6 = new Movie(4, "Отель Белград", "комедия");
        Movie Film7 = new Movie(5, "Человек-Невидимка", "ужасы");

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");

        String[] expected = {"Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void test6() {
        MoviesManager manager = new MoviesManager(6);

        Movie Film1 = new Movie(1, "Бладшот", "боевик");
        Movie Film2 = new Movie(2, "Вперёд", "мультфильм");
        Movie Film3 = new Movie(3, "Джентельмены", "Боевик");
        Movie Film4 = new Movie(4, "Отель Белград", "комедия");

        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");


        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);


    }
}
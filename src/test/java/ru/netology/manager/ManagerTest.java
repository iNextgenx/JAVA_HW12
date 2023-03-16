package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    Manager manager = new Manager();

    @Test
    public void add3FilmsTest() {  // Тест для 3 фильмов

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");

        String[] actual = manager.findAll();
        String[] expected = {"Film1", "Film2", "Film3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add0FilmsTest() {  // Тест для 0 фильмов

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add1FilmTest() {  // Тест для 1 фильмов

        manager.addFilm("Film1");

        String[] actual = manager.findAll();
        String[] expected = {"Film1"};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldTestFindLAst3() {  // Тест findLast без параметра для 3 фильмов

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");

        String[] expected = {"Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindAll() {

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLAst6() {  // Тест findLast без параметра для 6 фильмов

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");
        manager.addFilm("Film6");

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLAst0() {  // Тест findLast без параметра для 0 фильмов

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLAst1() {  // Тест findLast без параметра для 1 фильмов

        manager.addFilm("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTestFindLAst5() {  // Тест findLast без параметра для 5 фильмов

        manager.addFilm("Film1");
        manager.addFilm("Film2");
        manager.addFilm("Film3");
        manager.addFilm("Film4");
        manager.addFilm("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

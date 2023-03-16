package ru.netology.manager;

public class Manager {
    private int limit;

    public Manager() {
        this.limit = 5;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    private String[] films = new String[0];

    public void addFilm(String film) {               // Добавление фильма

        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {                     // Вывод всех фильмов
        return films;
    }

    public String[] findLast() {                    // Вывод последних 5 или (параметр) фильмов

        int lastLength;
        if (films.length < limit) {
            lastLength = films.length;

        } else {
            lastLength = limit;
        }

        String[] tmp = new String[lastLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}

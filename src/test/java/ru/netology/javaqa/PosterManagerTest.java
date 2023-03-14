package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterData name1 = new PosterData("Бладшот");
    PosterData name2 = new PosterData("Вперёд");
    PosterData name3 = new PosterData("Отель <<Белград>>");
    PosterData name4 = new PosterData("Джентельмены");
    PosterData name5 = new PosterData("Человек-невидимка");
    PosterData name6 = new PosterData("Тролли. Мировой тур");
    PosterData name7 = new PosterData("Номер один");


    @Test
    public void test() {
        PosterManager repo = new PosterManager();
        repo.addNewMovie(name1);
        repo.addNewMovie(name2);
        repo.addNewMovie(name3);
        repo.addNewMovie(name4);
        repo.addNewMovie(name5);
        repo.addNewMovie(name6);
        repo.addNewMovie(name7);

        PosterData[] expected = {name1, name2, name3, name4, name5, name6, name7};
        PosterData[] actual = repo.getMovieNames();


        Assertions.assertArrayEquals(expected, actual);

    }

}

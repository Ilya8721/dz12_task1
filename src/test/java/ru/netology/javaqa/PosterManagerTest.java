package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PosterManagerTest {
    PosterData name1 = new PosterData("Бладшот");
    PosterData name2 = new PosterData("Вперёд");
    PosterData name3 = new PosterData("Отель <<Белград>>");
    PosterData name4 = new PosterData("Джентельмены");
    PosterData name5 = new PosterData("Человек-невидимка");
    PosterData name6 = new PosterData("Тролли. Мировой тур");
    PosterData name7 = new PosterData("Номер один");

    PosterManager manager = new PosterManager();


    @BeforeEach
    public void setup() {
        manager.addNewMovie(name1);
        manager.addNewMovie(name2);
        manager.addNewMovie(name3);
        manager.addNewMovie(name4);
        manager.addNewMovie(name5);
        manager.addNewMovie(name6);
        manager.addNewMovie(name7);
    }


    @Test
    public void addNewMovie() {

        PosterData[] expected = {name1, name2, name3, name4, name5, name6, name7};
        PosterData[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldReverseMovieNames() {

        PosterData[] expected = {name7, name6, name5, name4, name3};
        PosterData[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({"10"})

    public void shouldReverseMovieNames10(int resultLength) {

        PosterData[] expected = {name7, name6, name5, name4, name3, name2, name1};
        PosterData[] actual = manager.findLast(resultLength);

        Assertions.assertArrayEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource({"3"})

    public void shouldReverseMovieNames3(int resultLength) {

        PosterData[] expected = {name7, name6, name5};
        PosterData[] actual = manager.findLast(resultLength);

        Assertions.assertArrayEquals(expected, actual);
    }

}

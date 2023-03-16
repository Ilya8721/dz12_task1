package ru.netology.javaqa;

public class PosterManager {
    private PosterData[] movieNames = new PosterData[0];
    private int limit = 5;

    public PosterManager() {}
    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void addNewMovie(PosterData name) {
        PosterData[] tmp = new PosterData[movieNames.length + 1];
        for (int i = 0; i < movieNames.length; i++) {
            tmp[i] = movieNames[i];
        }
        tmp[tmp.length - 1] = name;
        movieNames = tmp;
    }


    public PosterData[] findAll() {
        return movieNames;
    }


    public PosterData[] findLast() {

        int resultLength;
        if (limit > movieNames.length) {
            resultLength = movieNames.length;
        } else {
            resultLength = limit;
        }

        PosterData[] reversed = new PosterData[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movieNames[movieNames.length - 1 - i];
        }
        return reversed;
    }
}

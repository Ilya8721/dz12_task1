package ru.netology.javaqa;

public class PosterManager {
    private PosterData[] movieNames = new PosterData[0];


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
        PosterData[] all = findAll();
        int resultLength = 5;
        PosterData[] reversed = new PosterData[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


    public PosterData[] findLast(int resultLength) {
        PosterData[] all = findAll();
        if (resultLength > all.length) {
            resultLength = all.length;
        } else {
            resultLength = resultLength;
        }
        PosterData[] reversed = new PosterData[resultLength];
        for (int i = 0; i < resultLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}

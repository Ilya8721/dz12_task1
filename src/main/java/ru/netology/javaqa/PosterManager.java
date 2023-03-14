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

    public PosterData[] getMovieNames() {
        return movieNames;
    }
}

package com.greedy.stream;

public class Movie {

    private String title;
    private String genre;
    private double rating;
    private int duration;

    public Movie(String title, String genre, double rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getDuration() {
        return duration;
    }
}


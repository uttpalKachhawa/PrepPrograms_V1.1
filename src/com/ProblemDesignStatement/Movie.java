package com.ProblemDesignStatement;

/**
 * @author uttpal on Sep, 2020
 */
public class Movie {
    public String movie;
    public double rating;

    Movie(String movie,double rating){
        this.movie=movie;
        this.rating=rating;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

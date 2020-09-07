package com.ProblemDesignStatement;

/**
 * @author 703238043 on Sep, 2020
 */
public interface RatingCollector {

    public void putNewRating(String movie,double rating);
    public double getAverageRating(String movie);
    public int getRatingCount(String movie);
}

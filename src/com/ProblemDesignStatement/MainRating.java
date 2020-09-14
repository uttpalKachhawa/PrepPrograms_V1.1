package com.ProblemDesignStatement;

/**
 * @author uttpal on Sep, 2020
 */
public class MainRating {

    public static void main(String[] args) {

        RatingCollector ratingCollector= new RatingCollectorImpl();
        ratingCollector.putNewRating("Titan",5.0);
        ratingCollector.putNewRating("Titan",4.0);
        ratingCollector.putNewRating("Titan",1.0);
        ratingCollector.putNewRating("Titan",2.0);
        ratingCollector.putNewRating("Titan",3.0);
        ratingCollector.putNewRating("Titanic",2.0);
        ratingCollector.putNewRating("Titanic",4.0);
        ratingCollector.putNewRating("Titanic",6.0);
        ratingCollector.putNewRating("BEJ",4.0);
        ratingCollector.putNewRating("BEJ",4.6);

       // System.out.println("ratingCollector = " + ratingCollector);
        System.out.println("ratingCollector = " + ratingCollector.getAverageRating("Titan"));
        System.out.println("ratingCollector = " + ratingCollector.getAverageRating("Titanic"));
        System.out.println("ratingCollector = " + ratingCollector.getAverageRating("BEJ"));
        System.out.println("ratingCollector = " + ratingCollector.getRatingCount("Titan"));
        System.out.println("ratingCollector = " + ratingCollector.getRatingCount("Titanic"));
        System.out.println("ratingCollector = " + ratingCollector.getRatingCount("BEJ"));







    }
}

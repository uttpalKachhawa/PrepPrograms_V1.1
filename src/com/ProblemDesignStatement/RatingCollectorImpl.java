package com.ProblemDesignStatement;

import java.util.*;

/**
 * @author uttpal on Sep, 2020
 */
public class RatingCollectorImpl implements RatingCollector {

    Map<String, Map<Integer, List<Double>>> map = new WeakHashMap<>();

    @Override
    public void putNewRating(String movie, double rating) {
        if (map.containsKey(movie)) {
            Map<Integer, List<Double>> map1 = map.get(movie);
            Map<Integer, List<Double>> newMap = new HashMap<>();
            int count = map1.keySet().iterator().next();
            List<Double> ratings = map1.get(count);
            ratings.add(rating);
            newMap.put(count+1, ratings);
            map.put(movie, newMap);
        } else {
            List<Double> list = new ArrayList<>();
            Map<Integer, List<Double>> newMap = new HashMap<>();
            list.add(rating);
            newMap.put(1, list);
            map.put(movie, newMap);

        }
    }

    @Override
    public double getAverageRating(String movie) {
        double rating = 0;
        if (map.containsKey(movie)) {
            Map<Integer, List<Double>> map1 = map.get(movie);
            int count = map1.keySet().iterator().next();
            List<Double> ratings = map1.get(count);
            int size = ratings.size();
            for (Double d : ratings) {
                rating += d;
            }
            return rating / size;
        } else {
            return 0;
        }
    }

    @Override
    public int getRatingCount(String movie) {
        if (map.containsKey(movie)) {
            Map<Integer, List<Double>> map1 = map.get(movie);
            int count = map1.keySet().iterator().next();
            return count;
        } else {
            return 0;
        }

    }
}

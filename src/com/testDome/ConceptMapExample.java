package com.testDome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 703238043 on Sep, 2020
 */
public class ConceptMapExample {

    public static void main(String[] args) {

        Map<Integer, List<Double>> newMap= new HashMap<>();
        List<Double> list = new ArrayList<>();
        list.add(2.0);
        list.add(3.0);
        list.add(5.0);
        list.add(6.0);
        System.out.println(list);
        newMap.put(1,list);
        System.out.println(newMap);
        System.out.println(newMap.get(1));

       Map<String,Map<Integer, List<Double>>> map = new HashMap<>();
       map.put("movie",newMap);
        System.out.println(map);
        Map<Integer, List<Double>> map1=map.get("movie");
        System.out.println(map1);
        int count= map.get("movie").keySet().iterator().next();
        System.out.println(count);
        List<Double> ratings = map1.get(count);
        System.out.println(ratings);






    }
}

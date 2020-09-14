package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author uttpal on Jul, 2020
 */
public class MapReduceExample {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5","1");

        List<Integer> listOfIntegers = listOfStrings.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(listOfIntegers);

        List <Integer> integerList =listOfStrings.stream().map(Integer::valueOf).distinct().collect(Collectors.toList());

        System.out.println("duplicates are"+ integerList);


    }
}

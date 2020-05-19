package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 703238043 on Apr, 2020
 */
public class GroupByExample {
    public static void main(String[] args) {


    List<String> items= Arrays.asList("apple", "apple", "banana",
            "apple", "orange", "banana", "papaya");

    Map<String,Long>  result=
            items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())
            );
        System.out.println(result);


        Map<String, Long> finalMap = new LinkedHashMap<>();

        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByKey().reversed()
                        ).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


        System.out.println(finalMap);


    }
}

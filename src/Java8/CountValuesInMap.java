package Java8;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author uttpal on Jul, 2020
 */
public class CountValuesInMap {
int val=10;
    public static void main(String[] args) {
        CountValuesInMap m= new  CountValuesInMap();
        System.out.println(m.val);

        Map<String, Integer> map = new HashMap();
        map.put("a", 12);
        map.put("b", 3);
        map.put("c", 24);
        map.put("d",24);
        System.out.println(map.entrySet().stream().filter(x -> x.getValue() > 0)
                .mapToInt(x -> x.getValue()).sum());

        String[] chars = { "A", "B", "C", "A", "C", "A" };

        Map<String, Long> freq =
                Stream.of(chars)
                        .collect(Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));

        System.out.println(freq);
        String name= new String("a,b,c");
        name=name.replaceAll(",",":");
        System.out.println(name);



    }
}



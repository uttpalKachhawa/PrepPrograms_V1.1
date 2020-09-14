package Java8;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author uttpal on Jul, 2020
 */
public class TestForEach {

    public static void main(String[] args) {

        String[] str = {"test", "test1", "test2", "test3"};

        List<String> list = Arrays.asList(str);
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.forEach(s -> System.out.print(s));
        list.forEach(System.out::println);

        list.forEach(l -> {
            if ("test".equals(l)) {
                System.out.println(l);
            }
        });

        list.stream().filter(f->"test".equals(f)).forEach(System.out::println);


        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("D", 30);
        map.put("K", 50);
        map.put("Z", 60);
        map.put("M", 70);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }


        map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

        map.forEach((k, v) -> {
            System.out.println("keys: " + k + "values :" + v);
            if ("D".equals(k)) {

                System.out.println("Hello D");
            }
        });
    }
}

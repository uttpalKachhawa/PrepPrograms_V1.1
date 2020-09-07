package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author 703238043 on Jul, 2020
 */
public class PredicateExample {

    public static void main(String[] args) {
        //Find all elements not start with ‘A’.
        Predicate<String> startsWithA=x->x.startsWith("A");

        List<String> list= Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        System.out.println("list.size() = " + list.size());
        List<String> collect=list.stream()
                .filter(startsWithA.negate())
                .collect(Collectors.toList());

        System.out.println("collect = " + collect.size());

        System.out.println(PredicateExample.filter(
                list, x -> x.startsWith("A")));

        System.out.println(PredicateExample.filter(
                list, x -> x.startsWith("A") && x.length() == 3));


    }


    private static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }

}

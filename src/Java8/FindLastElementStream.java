package Java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author 703238043 on Jul, 2020
 */
public class FindLastElementStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("node", "java", "c++", "react", "javascript");

        String result=list.stream().reduce((first,second)->second).orElse("No last element");

        System.out.println("result = " + result);

        // get last element from a stream, via skip
        String result2 = list.stream().skip(list.size() - 1).findFirst().orElse("no last element");

        System.out.println("result2 = " + result2);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(list1.get(list.size() - 1));
        System.out.println(list1.get(list.size() - 2));
        System.out.println(list1.get(list.size() - 3));
        System.out.println(list1.get(list.size() - 4));
        System.out.println(list1.get(list.size() - 5));


    }
}

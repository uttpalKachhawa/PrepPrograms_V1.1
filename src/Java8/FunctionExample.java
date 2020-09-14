package Java8;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author uttpal on Jul, 2020
 */
public class FunctionExample {

    public static void main(String[] args) {

        //Simple function example
        Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("uttpal");
        System.out.println("apply = " + apply);

        //Chain function example
        Function<String, Integer> funct = x -> x.length();
        Function<Integer, Integer> funct1 = x -> x * 2;

        Integer result = func.andThen(funct1).apply("uttpalkachhawa");
        System.out.println("result = " + result);


        //Covert list into map using Function interface
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
        System.out.println("list = " + list);
        //Lambda
        Map<String, Integer> map = convertListToMap(list, x -> x.length());
        System.out.println("map = " + map);

        // method reference
        Map<String, Integer> methodRefreanceMap = convertListToMap(list, FunctionExample::getLength);
        System.out.println("methodRefreanceMap = " + methodRefreanceMap);

    }

    private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;


    }

    private static Integer getLength(String str) {
        return str.length();
    }
}
package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author 703238043 on Jul, 2020
 */
class SimplePrinter {
    public static void print(String str) {
        System.out.println(str);
    }
}
class IntegerUtils {

    public static String join(Integer a, Integer b) {
        return String.valueOf(a + b);
    }
}
public class MethodReferenceExample {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "java", "python", "ruby");

        //using lambda
            list.forEach(x->System.out.println(x));

            //using method reference
        list.forEach(System.out::println);

        list.forEach(SimplePrinter::print);

        List<String> listOfInteger = Arrays.asList("1", "2", "3", "4");

        //Convert String into Integer
        listOfInteger.forEach(System.out::print);

        //Convert List of String into Integer
        List<Integer> convertd=listOfInteger
                .stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        System.out.println("after conversion-->" +convertd);

        listOfInteger.stream().map(f->Integer.parseInt(f)).collect(Collectors.toList());
        System.out.println("convertd = " + convertd);


        /**To Join two integer and returns a string.**/

        // anonymous class
        String result1 = playTwoArgument(1, 2, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer a, Integer b) {
                return IntegerUtils.join(a, b);
            }
        });

        System.out.println("result1 = " + result1);


        //using lambda
        String result2=playTwoArgument(1,2,(a,b)-> IntegerUtils.join(a,b));

        System.out.println("result2 = " + result2);
        //method reference
        String result3=playTwoArgument(1,2,IntegerUtils::join);

        System.out.println("result3 = " + result3);

    }
        //BiFunction accepts two arguments and return a result
    private static <R> R playTwoArgument(Integer i1, Integer i2,
                                         BiFunction<Integer, Integer, R> func) {
        return func.apply(i1, i2);
    }


}

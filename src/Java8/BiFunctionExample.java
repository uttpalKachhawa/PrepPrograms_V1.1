package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author 703238043 on Jul, 2020
 */

class GPS{

    private String Latitude;
    private String Longitude;


    public GPS(){

    }
    public GPS(String latitude, String longitude) {
        Latitude = latitude;
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "GPS{" +
                "Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                '}';
    }
}
public class BiFunctionExample {

    public static void main(String[] args) {
        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        Integer result=func.apply(2,3);
        System.out.println("result = " + result);

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);

        List<Integer> list=func3.apply(2,3);
        list.forEach(System.out::println);

        //BiFunction<T, U, R> + Function<T, R>

        BiFunction<Integer,Integer,Double> func4= (a1, a2) -> Math.pow(a1, a2);

        Function<Double,String> function= (input)->"Result " + String.valueOf(input);

        String result1= func4.andThen(function).apply(2,4);

        System.out.println("result1 = " + result1);


        GPS obj=factory("40.741895", "-73.989308", GPS::new);
        System.out.println("obj = " + obj);

    }

    private static <R extends  GPS> R factory(String latitude,String longitude,BiFunction<String,String, R> function){
        return function.apply(latitude,longitude);
    }



}

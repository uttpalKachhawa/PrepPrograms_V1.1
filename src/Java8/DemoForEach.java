package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author uttpal on Jul, 2020
 */
class ConsumerImplement implements  Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println("integer = " + integer);;
    }

}

public class DemoForEach {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,9,7,8,9,10,11,12,18,18);

        list.stream().sequential().filter(i-> i%2==0).sorted().forEach(i-> System.out.println(i));
        System.out.println("After Sequential");
        list.stream().parallel().forEach(i-> System.out.println(i));

       // list.stream().parallel().forEach(i -> System.out.println("parallel = " + list));
       // list.stream().sequential().forEach(i -> System.out.println("sequential = " + list));
        /*for(Integer i:list){
            System.out.println(i);
        }*/

        //list.forEach(i-> System.out.println(i));

       // Consumer<Integer> cons=new ConsumerImplement();
        //list.forEach(cons);

    }
}

package concepts.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @author uttpal on Aug, 2020
 */
public class TestEqualsHashcode {

    public static void main(String[] args) {
        Geeks geeks=new Geeks("uttpal",1);
        Geeks geeks1=new Geeks("uttpal",1);

        Map<Geeks , String> map=new HashMap<>();
        map.put(geeks, "CSE");
        map.put(geeks1, "IT");
       // map.put(geeks1, "CSE");

        System.out.println("map values are---"+map);
        System.out.println("Test size"+map.size());

        TreeSet<String> set= new TreeSet<>();
        set.add("Steve_Smith");
        set.add("Virat_Kohli");
        set.add("Virat_Kohli");
        set.add("Virat_Kohli");
        set.add("Steve_Smith");

        System.out.println("set = " + set);
    }

}

package com.testDome;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 703238043 on Aug, 2020
 */
public class TestSomething {

    public static void main(String[] args) {

        String str="abc";
        String str2= new String("abc");
        System.out.println(str==str2);
        str2.intern();
        System.out.println(str==str2);

        Map<Integer,String>  map= new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(null,null);
        //map.put(null,null);
       /// map.put(null,"T");
        map.put(3,"C");
        map.put(1,"D");
        Set set= new HashSet<>();
        set.add("apple");
        set.add("Apple");
        System.out.println("sset"+set);

        System.out.println(map);

        System.out.println(map.get(1));



        int x=0;
        int y=0;
        for(int z=0;z<5;z++){

            if((++x>2)|| (++y>2)){
                x++;
            }
        }
        System.out.println(x+""+y);
    }

}

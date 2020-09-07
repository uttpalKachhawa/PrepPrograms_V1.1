package Java8;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author 703238043 on Jul, 2020
 */
class Challenge {
    static String str = "";
    public static void main(String[] args) {

        System.out.println("Value of a :" + test());

       /* String fchar = firstNonRepeatingLetter("sTreSS");
        System.out.println("fchar = " + fchar);
    }

    public static String firstNonRepeatingLetter(String str) {
        String firstChar = "";
        Map<Character, Integer> count = new LinkedHashMap<>(str.length());
        for (Character c : str.toCharArray()) {
            count.put(c, count.containsKey(c) ? count.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                firstChar = String.valueOf(entry.getKey());
                return firstChar;
            }
            *//*else {
                return firstChar;
            }*//*
        }
        return firstChar;
        // return firstChar;
    //throw new RuntimeException("test");
}*/


        /*System.out.println("strterd");
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.poll());
        System.out.println(q.offer(3));
        q.add(1);
        q.remove(2);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println("end");*/

      /*  Map<String, String> hashMap = new HashMap<>();
        hashMap.put(new String("a"), "audi");
        hashMap.put(new String("a"), "ferrari");
                System.out.println(hashMap);*/

    }

    private static boolean test() {
        boolean flag = false;
        try {
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally
        {
        }

        System.out.println("from try finally outside");

        return flag;
    }

}
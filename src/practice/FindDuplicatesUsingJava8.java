package practice;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author uttpal on Jul, 2020
 */
public class FindDuplicatesUsingJava8 {

    public static void main(String[] args) {
        ConcurrentHashMap<Character, LongAdder> occurence=new ConcurrentHashMap<>();

        String str="ABCDA ABCD ABCD";
        for(char character:str.toCharArray()){
            occurence.computeIfAbsent(character,ch->new LongAdder()).increment();
        }
        System.out.println(occurence);
    }


}

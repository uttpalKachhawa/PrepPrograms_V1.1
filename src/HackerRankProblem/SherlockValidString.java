package HackerRankProblem;

import java.io.IOException;
import java.util.*;

/**
 * @author uttpal on Sep, 2020
 */
public class SherlockValidString {

    // Complete the isValid function below.
    static String isValid(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, (count + 1));
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            /*System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());*/
            int count1=frequencyMap.containsKey(entry.getValue())? frequencyMap.get(entry.getValue()) : 0;
               frequencyMap.put(entry.getValue(),(count1+1));


    }


        if (frequencyMap.keySet().size() > 2)
            return "NO";

        if (frequencyMap.keySet().size() == 1)
            return "YES";


        Iterator<Integer> iterator1 = frequencyMap.keySet().iterator();

        iterator1 = frequencyMap.keySet().iterator();


        int freq1 = iterator1.next();
        int freq2 = iterator1.next();

        if (freq1 > freq2) {
            int temp = freq1;
            freq1 = freq2;
            freq2 = temp;

        }

        if (freq1 == 1) {
            return (frequencyMap.get(freq1) == 1 ? "YES" : "NO");
        }
        if (freq2 == freq1 + 1) {
            return (frequencyMap.get(freq2) == 1) ? "YES" : "NO";
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = isValid(s);
        System.out.println(result);


        scanner.close();
    }
}

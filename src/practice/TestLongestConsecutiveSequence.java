package practice;

import java.util.*;

public class TestLongestConsecutiveSequence {
    public static int LongIncrConseqSubseq(int arr[]) {
        // create hashmap to save latest consequent
        // number as "key" and its length as "value"
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 1);
        for (int i = 1; i < arr.length; i++) {
            // check if last consequent of arr[i] exist or not
            if (map.containsKey(arr[i] - 1)) {
                map.put(arr[i], map.get(arr[i] - 1) + 1);
                map.remove(arr[i] - 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        return Collections.max(map.values());
    }

    public static void main(String args[]) {
        int arr[] = {2,3,1,2,3,4,2,3,4,5,6,1,2,2,3,3};
        System.out.println(LongIncrConseqSubseq(arr));
    }
}

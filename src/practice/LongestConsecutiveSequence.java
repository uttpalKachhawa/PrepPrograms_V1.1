package practice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 703238043 on Apr, 2020
 */
public class LongestConsecutiveSequence {


    public static void main(String[] args) {
        int a[] = {3,9,1,10,4,20,2,5};

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int oldlongestLength = 0;
        for (int i = 0; i < a.length; i++) {

            if (!set.contains(a[i] - 1)) {
                int num = a[i];

                while (set.contains(num)) {

                    num++;
                }

                if (oldlongestLength < num - a[i])
                    oldlongestLength = num - a[i]; //initialize old length with new length
            }
        }

        System.out.println("longest subsequent length is "+oldlongestLength);

    }
}

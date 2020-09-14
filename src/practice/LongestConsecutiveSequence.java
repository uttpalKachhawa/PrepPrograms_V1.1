package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author uttpal on Apr, 2020
 */
public class LongestConsecutiveSequence {


    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,3,4,2,3,4,5,6,1,2,2,3,3};

        List<Integer> set = new ArrayList<>();
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

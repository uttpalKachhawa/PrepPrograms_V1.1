package practice;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 703238043 on Apr, 2020
 */
public class FindDuplicateElements {

    public static void main(String[] args) {

        int a[]={10,20,30,0,30,10,20,-1,0,90};

        Set<Integer> hashSet=new HashSet<>();
        for(Integer i:a) {

            if (hashSet.add(i) == false) {
                System.out.println("Duplicate Element is" + i);
            } else
            {
                System.out.println("Without Duplicate element is"+i);
            }
        }


    }
}

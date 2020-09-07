package practice;

import javax.swing.*;
import java.util.*;

/**
 * @author 703238043 on Jul, 2020
 */
public class ClientComparableTest {


    public static void main(String[] args) {

        List<TestComparable> mainList = new ArrayList<TestComparable>();

        TestComparable plastic=new TestComparable(TestComparable.Size.BIG,"Plastic");
        TestComparable glass=new TestComparable(TestComparable.Size.BIG,"glass");

        Set<TestComparable> set= new HashSet<>();
        set.add(plastic);
        set.add(glass);

        System.out.println("set = " + set);

        Set<TestComparable> treset=new TreeSet<>();
        treset.add(plastic);
        treset.add(glass);

        System.out.println("treset = " + treset);

        mainList.addAll(set);
        Collections.sort(mainList);
        System.out.println("mainlist = " + mainList);

        if(System.out.printf("TITAN BEJ") != null){
            System.out.println("test");

        }

    }




}

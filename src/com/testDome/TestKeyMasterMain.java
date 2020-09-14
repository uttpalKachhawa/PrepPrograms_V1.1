package com.testDome;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.HashSet;
import java.util.Set;

/**
 * @author uttpal on Aug, 2020
 */
public class TestKeyMasterMain {

    public static void main(String[] args) {
        Set<KeyMaster> masterSet= new HashSet<>();
        KeyMaster k1= new KeyMaster("abc");
        KeyMaster k2= new KeyMaster("Abc");
        KeyMaster k3= new KeyMaster("abc");
        masterSet.add(k1);
        masterSet.add(k1);
        masterSet.add(k2);
        masterSet.add(k2);
        System.out.println(masterSet);
        boolean b=masterSet.contains(new KeyMaster("AB"));
        System.out.println(b);


        /*System.out.println("First size"+masterSet.size());
        k2.i=1;
        System.out.println(masterSet);

        System.out.println("second size"+masterSet.size());

        masterSet.remove(k1);
        System.out.println(masterSet);
        System.out.println("Third size"+masterSet.size());

        masterSet.remove(k2);
        System.out.println(masterSet);
        System.out.println("Furth size"+masterSet.size());
        System.out.println(masterSet);*/
    }
}

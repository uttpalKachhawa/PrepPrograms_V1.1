package com.testDome;

import java.util.HashMap;
import java.util.Map;

/**
 * @author uttpal on Sep, 2020
 */
public class TestMutableKey {

    public static void main(String[] args) {

        Map<MutableKey,Object> testMap=new HashMap();
        MutableKey mutableKey= new MutableKey();
        mutableKey.setName("TestName");
        testMap.put(mutableKey,new Object());
        Object o = testMap.get(mutableKey);
        System.out.println("before changing key = " + o);
        mutableKey.setName("NewName");
        o=testMap.get(mutableKey);
        System.out.println("after changing key = " + o);
    }
}

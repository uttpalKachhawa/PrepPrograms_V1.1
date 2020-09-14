package com.testDome;

import java.util.Objects;

/**
 * @author uttpal on Aug, 2020
 */

public class KeyMaster {

    public String i;
    public KeyMaster(String i){
        this.i=i;
    }

    public boolean equals(Object o){

        return  i==((KeyMaster)o).i;
    }

    @Override
    public int hashCode() {
       /* int hash=i.hashCode();
        System.out.println("value of "+hash);*/
       int hash=1;
        System.out.println("value of "+hash);
        return hash;
    }

    @Override
    public String toString() {
        return "KeyMaster{" +
                "i=" + i +
                '}';
    }
}

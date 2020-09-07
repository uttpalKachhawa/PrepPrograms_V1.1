package com.testDome;

/**
 * @author 703238043 on Aug, 2020
 */

class TestA
{

    int x=10;

    public int m1(){
        return  x;
    }

}


class TestB extends  TestA{

    public int m2(){
        return  2*x;
    }
}
public class TestMain {

    public static void main(String[] args) {

        TestA testA= new TestB();
        System.out.println(testA.m1());
        System.out.println(testA.x);
       // System.out.println(testA.m2());

        try{


        }
        catch (Exception ex){

            System.out.println();
            return;
        }

finally {
            return;
        }
    }
}

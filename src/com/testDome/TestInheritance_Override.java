package com.testDome;

/**
 * @author 703238043 on Sep, 2020
 */

class P1{

    public void m1(){
        System.out.println("From m1 -->P1");
        m2();
    }

    public void m2(){
        System.out.println("method m2 is called-->P1");
    }
}


class P2 extends  P1{

    public void m1(){
        System.out.println("From m1-->P2");
        m2();
    }

    public void m2(){
        System.out.println("method m2 is called-->P2");
    }
}

public class TestInheritance_Override {

    public static void main(String[] args) {

        P1 p1= new P2();
        p1.m1();
    }


}

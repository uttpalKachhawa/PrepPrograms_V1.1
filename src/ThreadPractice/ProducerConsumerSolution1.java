package ThreadPractice;

import java.util.LinkedList;

/**
 * @author uttpal on May, 2020
 */
public class ProducerConsumerSolution1 {
    public static void main(String[] args) throws InterruptedException {

        final Customer c=new Customer();
        new Thread(){
            public void run(){
                c.withdraw(15000);}
        }.start();

        new Thread(){
            public void run(){

                c.deposit(10000);}
        }.start();
    }

}

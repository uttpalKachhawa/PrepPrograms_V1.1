package com.CustomThreadPool;

/**
 * @author 703238043 on Apr, 2020
 */
public class ClientThreadPool {

    public static void main(String[] args) throws  InterruptedException{

        ThreadPool threadPool=new ThreadPool(3,3);
        for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
            TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }

    }
}

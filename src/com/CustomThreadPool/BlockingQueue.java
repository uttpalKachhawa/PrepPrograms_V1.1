package com.CustomThreadPool;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 703238043 on Apr, 2020
 */
public class BlockingQueue<Type> {

    private Queue<Type>  queue= new LinkedList<Type>();
    private int MAX_TASK_IN_QUEUE = -1;
    private int EMPTY=0;

    public BlockingQueue(int size){
        this.MAX_TASK_IN_QUEUE=size;
    }


    public synchronized  void enqeue(Type task) throws  InterruptedException{

    while(this.queue.size()== this.MAX_TASK_IN_QUEUE)
    {
        wait();
    }

        if(this.queue.size() == EMPTY) {
            notifyAll();
        }
        this.queue.offer(task);



    }


    public synchronized  Type dequeue() throws  InterruptedException{

        while (this.queue.size()==EMPTY){
            wait();
        }
        if(this.queue.size() == this.MAX_TASK_IN_QUEUE){
            notifyAll();
        }

        return this.queue.poll();

    }
}

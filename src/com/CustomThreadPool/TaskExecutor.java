package com.CustomThreadPool;




/**
 * @author 703238043 on Apr, 2020
 */
public class TaskExecutor implements  Runnable{

    BlockingQueue<Runnable> queue;

    TaskExecutor(BlockingQueue<Runnable> queue){
    this.queue=queue;
}

    @Override
    public void run(){

        try {
            while (true) {
                String name = Thread.currentThread().getName();
                Runnable task = queue.dequeue();
                System.out.println("Task Started by Thread :" + name);
                task.run();
                System.out.println("Task Finished by Thread :" + name);

            }
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

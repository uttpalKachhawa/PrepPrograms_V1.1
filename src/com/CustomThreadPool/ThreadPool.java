package com.CustomThreadPool;


/**
 * @author 703238043 on Apr, 2020
 */
public class ThreadPool {

    BlockingQueue<Runnable> queue;

    ThreadPool(int queueSize, int nThread) {
        queue = new BlockingQueue<>(queueSize);
        String threadName = null;
        TaskExecutor task = null;
        for (int count = 0; count < nThread; count++) {
            threadName = "Thread-" + count;
            task = new TaskExecutor(queue);
            Thread thread = new Thread(task, threadName);
            thread.start();
        }
    }

    public void submitTask(Runnable task) throws InterruptedException {
        queue.enqeue(task);
    }
}

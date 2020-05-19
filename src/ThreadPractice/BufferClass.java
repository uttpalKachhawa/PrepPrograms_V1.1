package ThreadPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 703238043 on May, 2020
 */
public class BufferClass<T> {

    private Queue<T> queue = new LinkedList<>();
    private int capacity;
    private Lock lock = new ReentrantLock();
    private Condition produced = lock.newCondition();
    private Condition consumed = lock.newCondition();

    public BufferClass(int capacity) {
        this.capacity = capacity;
    }

    public void put(T element) throws InterruptedException {
       // System.out.println(Thread.currentThread().getName());
        lock.lock();
        try {
            while (queue.size() == capacity) {
                System.out.println("Awaiting");
                produced.await();
                System.out.println("After added.await() in put method");
            }
            queue.add(element);
            System.out.println("Adding - " + element);
            System.out.println("Before Removed.signal method in put method");
            consumed.signal();
            System.out.println("After Removed.signal method in put method");
        } finally {
           System.out.println("Before Finally block execution in PUT method");
            lock.unlock();
            System.out.println("After Finally block execution in PUT method");
        }
    }

    public T take() throws InterruptedException {
      //  System.out.println(Thread.currentThread().getName());
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println("Inside when Queue is Empty");
                consumed.await();
                System.out.println("After Removed.await method in take method");
            }
            T item = queue.remove();
            System.out.println("Removing - " + item);
            System.out.println("Before added.signal method in take method");
            produced.signal();
            System.out.println("After added.signal method in take method");
            return item;
        } finally {
            System.out.println("Before Finally block execution in Get method");
            lock.unlock();
            System.out.println("After Finally block execution in Get method");
        }
    }

}

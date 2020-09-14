package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public interface LockCustomInterface {

    void lock();
    void unlock();
    boolean tryLock();
}

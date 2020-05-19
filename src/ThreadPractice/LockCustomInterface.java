package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public interface LockCustomInterface {

    void lock();
    void unlock();
    boolean tryLock();
}

package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class ReentrantCustomLock implements LockCustomInterface {

    public int lockHoldCount;

    //Id of thread which is currently holding the lock.
    long IdOfThreadCurrentlyHoldingLock;


    public ReentrantCustomLock(int lockHoldCount) {
        lockHoldCount = 0;
    }

    @Override
    public synchronized void lock() {

        if (lockHoldCount == 0) {

            lockHoldCount++;
            IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
        } else if (lockHoldCount > 0 && IdOfThreadCurrentlyHoldingLock == Thread.currentThread().getId()) {
            lockHoldCount++;
        } else {

            try {

                wait();
                lockHoldCount++;
                IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }


    }

    @Override
    public synchronized void unlock() {
        //current thread is not holding the lock, throw IllegalMonitorStateException.
        if (lockHoldCount == 0)

            throw new IllegalMonitorStateException();
        lockHoldCount--; //decrement lock hold count by 1
        //if lockHoldCount is 0, lock is released, and
        //one waiting thread is notified.

        if (lockHoldCount == 0) {
            notify();
        }
    }


    @Override
    public boolean tryLock() {

    if(lockHoldCount==0){

        lock();
        return  true;
    }
    else
        return false;
    }
}

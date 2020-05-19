package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class CountDownLatchCustom {

    private int count;
    CountDownLatchCustom(int count){
        this.count=count;
    }

    public synchronized void await() throws InterruptedException {

        if (count > 0) {

            this.wait();
        }

    }
        public synchronized void countDown() throws  InterruptedException{

        count--;

        if(count==0){
            this.notify();
        }


        }


}

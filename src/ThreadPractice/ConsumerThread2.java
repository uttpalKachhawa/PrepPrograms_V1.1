package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ConsumerThread2 implements  Runnable{

    BufferClass<Integer> bufferClass;

    ConsumerThread2(BufferClass bufferClass){
        this.bufferClass=bufferClass;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {

            try {
                // Thread.sleep(500);
                bufferClass.take();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

package ThreadPractice;

/**
 * @author 703238043 on May, 2020
 */
public class ProducerThread2 implements  Runnable{

    public BufferClass<Integer> bufferClass;

    ProducerThread2(BufferClass<Integer> bufferClass){
        this.bufferClass=bufferClass;
    }

    @Override
    public void run() {

        for(int i=1;i<=10;i++){
            try {
                //Thread.sleep(10);
                bufferClass.put(i);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

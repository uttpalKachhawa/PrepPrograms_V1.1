package ThreadPractice;

/**
 * @author uttpal on May, 2020
 */
public class ConsumerThread  extends  Thread{

    ProducerThread p;

    ConsumerThread(ProducerThread p){
        this.p=p;
    }


    @Override
    public void run() {
        synchronized (this.p){
            try {
                System.out.println("Consumer waiting for production to get over.");
                this.p.wait();
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            /*production is over, consumer will start consuming.*/
            int productSize=this.p.sharedQueue.size();
            for(int i=0;i<productSize;i++)
                System.out.println("CONSUMED : "+ this.p.sharedQueue.remove(0) +" ");

}







    }
}

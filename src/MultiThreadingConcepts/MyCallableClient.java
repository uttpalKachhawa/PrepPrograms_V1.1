package MultiThreadingConcepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author uttpal on Apr, 2020
 */
public class MyCallableClient {

    public static void main(String[] args)  throws  Exception{
        MyTask[] jobs={

                new MyTask(10),
                new MyTask(20),
                new MyTask(30),
                new MyTask(40),
                new MyTask(50),
                new MyTask(60),


        };

        ExecutorService service= Executors.newFixedThreadPool(3);
        for(MyTask task:jobs){
            Future f=service.submit(task);
            System.out.println(f.get());
        }

        service.shutdown();


    }
}

package MultiThreadingConcepts;

import java.util.concurrent.Callable;

/**
 * @author uttpal on Apr, 2020
 */
public class MyTask implements Callable {

    int num;

    MyTask(int num){
        this.num=num;

    }


    @Override
    public Object call() throws Exception {

        int sum=0;
        for(int i=0;i<num;i++){
            sum=sum+i;
        }


        return sum;
    }
}




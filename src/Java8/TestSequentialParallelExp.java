package Java8;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author 703238043 on Jul, 2020
 */
public class TestSequentialParallelExp {


    public static void main(String[] args) {
        String [] str={"1","2","3","4","5","6","7","8","9","10"};

        System.out.println("Running sequential stream");
        run(Arrays.stream(str).sequential());
        System.out.println("-------\nRunning parallel\n-------");
        run(Arrays.stream(str).parallel());

    }


    private static void run(Stream<String> stream){

        stream.forEach(s -> {
            System.out.println(LocalTime.now() + " - value: " + s +
                    " - thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }

}

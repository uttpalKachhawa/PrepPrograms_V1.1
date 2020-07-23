package Java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * @author 703238043 on Jul, 2020
 */
 class Developer {

    String name;
    BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class BinaryOperatorExample {

    public static void main(String[] args) {

        //BinaryFunction
        BiFunction<Integer,Integer,Integer> func=(x1,x2)->x1+x2;

        Integer result=func.apply(2,3);

        System.out.println("result = " + result);


        //BinaryOperator
        BinaryOperator<Integer> binaryOperator=(x1,x2)->x1+x2;
        Integer result2=binaryOperator.apply(2,3);
        System.out.println("result2 = " + result2);


        //Binary Operator as Argument
        //stream.reduce() to sum all the Integer.
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list= Arrays.asList(numbers);

        Integer resultReduce=list.stream().reduce(0,(a,b)->a+b);
        System.out.println("resultReduce = " + resultReduce);

        Integer result1 = math(Arrays.asList(numbers), 0, (a, b) -> a + b);

        System.out.println(result1); // 55


        Integer resultReduce1=list.stream().reduce(0,Integer::sum);
        System.out.println("resultReduce1 = " + resultReduce1);

        Developer dev1 = new Developer("jordan", BigDecimal.valueOf(9999));
        Developer dev2 = new Developer("jack", BigDecimal.valueOf(8888));
        Developer dev3 = new Developer("jaden", BigDecimal.valueOf(10000));
        Developer dev4 = new Developer("ali", BigDecimal.valueOf(2000));
        Developer dev5 = new Developer("mkyong", BigDecimal.valueOf(1));


        List<Developer> newList = Arrays.asList(dev1, dev2, dev3, dev4, dev5);

            // 1. Create a Comparator

        Comparator<Developer> comparing=Comparator.comparing(Developer::getSalary);

        // 2. BinaryOperator with a custom Comparator
        BinaryOperator<Developer> bo = BinaryOperator.maxBy(comparing);

        Developer resultdev = find(newList, bo);
        System.out.println("resultdev = " + resultdev);

        Developer resultDev1=newList.stream().max(Comparator.comparing(Developer::getSalary)).orElse(null);

        System.out.println("resultDev1 = " + resultDev1);








    }


    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }


    private static Developer find(List<Developer> list, BinaryOperator<Developer> accumulator) {
        Developer result = null;
        for (Developer t : list) {
            if (result == null) {
                result = t;
            } else {
                result = accumulator.apply(result, t);
            }
        }
        return result;
    }
}

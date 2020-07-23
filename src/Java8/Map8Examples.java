package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 703238043 on Jul, 2020
 */
public class Map8Examples {

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a", "b", "c", "d");

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha); //[a, b, c, d]
        System.out.println(alphaUpper); //[A, B, C, D]


        List<String> collect =alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1=num.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

        List<Employee> employeList= new ArrayList<>();
        employeList.add(new Employee(1,"test",30));
        employeList.add(new Employee(2,"test1",40));
        employeList.add(new Employee(3,"test2",50));
        employeList.add(new Employee(4, "test3",60));

        List<Employee1> employee1ListConverted= employeList.stream().map(
                temp-> {
                    Employee1 employee1= new Employee1();
                    employee1.setName(temp.getName());
                    employee1.setId(temp.getId());
                    if("test".equals(temp.getName())){

                        employee1.setAge(31);
                    }
                    return  employee1;
                }).collect(Collectors.toList());

        System.out.println("employee1ListConverted = " + employee1ListConverted);
    }
}

package Java8;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author 703238043 on Jul, 2020
 */

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee() {

    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ConvertListToMap {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Test", "Test123", "Test1234", "Test", "Test12", "Testes");
        //List<Integer>  list= Arrays.asList(1,2,3,4,5);
        // convert stream of objects to collection,
        //   System.out.println(list.stream().collect(Collectors.toList()));

        //Find max of number or integer from a given list of objects
        // System.out.println(list.stream().max(String::compareTo));

//Basically, just iterates over every 2 elements and maps it with the next one.
//Note that if the number of elements is not even, it won't take into consideration the last element.
        //Boxed method is used for convert list of streams into collection
        Map<String, String> map =
                IntStream.iterate(0, i -> i + 2).limit(list.size() / 2)
                        .boxed()
                        .collect(Collectors.toMap(i -> list.get(i), i -> list.get(i + 1)));
        System.out.println("map = " + map);


        //Convert List to map using custom object
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "test", 20));
        employeeList.add(new Employee(2, "test1", 21));
        employeeList.add(new Employee(3, "test2", 31));
        employeeList.add(new Employee(3, "test3", 33));

        //id =key,value=name
        /*Map<Integer, String> result=employeeList.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        System.out.println("result = " + result);*/
        //id =key,value=name
        Map<String, Integer> result1 = employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println("result1 = " + result1);

        //id =key,value=name using lambda expression
        Map<String, Integer> result2 =
                employeeList.stream().collect(Collectors.toMap(x -> x.getName(), x -> x.getAge()));
        System.out.println("result2 = " + result2);

        //Solution for having duplicate keys exists then use old valye using merge function
        Map<Integer, String> result3 =
                employeeList.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName(),
                        (oldValue, newValue) -> newValue));

        System.out.println("result3 = " + result3);

        Map<Integer, String> result4 =
                employeeList.stream().collect(Collectors.toMap(x -> x.getId(), x -> x.getName(),
                        (oldValue, newValue) -> newValue,
                        LinkedHashMap::new));

        System.out.println("result4 = " + result4);

    }


}

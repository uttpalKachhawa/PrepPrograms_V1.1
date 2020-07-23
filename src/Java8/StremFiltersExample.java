package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 703238043 on Jul, 2020
 */
public class StremFiltersExample {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("spring", "node", "uttpal");

        List<String> filtered = list.stream().filter(line -> !"spring".equals(line))
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "test", 30));
        employeeList.add(new Employee(2, "test12", 31));
        employeeList.add(new Employee(3, "test34", 77));

        Employee employee = getStudentByName(employeeList, "test");
        System.out.println("employee = " + employee);

        //using filter api in java8
        Employee employee1 = employeeList.stream().filter(x -> "test".equals(x.getName())).
                findAny().
                orElse(null);
        System.out.println("employee1 = " + employee1);

        //using map function to convert streams into string
        String name=employeeList.stream().filter(x->"test".equals(x.getName())).
                map(x->new String(x.getName())).findAny()
                .orElse(null);

        System.out.println("name = " + name);

        //another way to convert using lambda expression
        String name1=employeeList.stream().filter(x->"test".equals(x.getName())).
                map(Employee::getName).findAny()
                .orElse(null);

        System.out.println("name1 = " + name1);


        List<String> convertListString=employeeList.stream().map(Employee::getName).collect(Collectors.toList());
       convertListString.forEach(s -> System.out.println("convertListString " +s));
        
        
    }

    private static Employee getStudentByName(List<Employee> employees, String name) {

        Employee result = null;
        for (Employee temp : employees) {
            if (!name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}

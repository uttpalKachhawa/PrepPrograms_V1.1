package SynechronProblem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uttpal on Jun, 2020
 */
public class EmployeeClient {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "uttpal", 31, "kachhawa");
        Employee emp2 = new Employee(2, "ajay", 30, "jain");
        Employee emp3 = new Employee(3, "neeraj", 29, "kumar");
        Employee emp4 = new Employee(4, "abhinav", 26, "kalani");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        employeeList.stream().filter(emp -> emp.getAge() > 26).sorted((Employee e1, Employee e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
                .forEach(System.out::println);

    }
}

package Java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uttpal on Jul, 2020
 */

class Employee1{
    private int id;
    private String name;
    private int age;


     public Employee1(){

     }
    public Employee1(int id, String name, int age) {
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
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ComparatorExample {

    public static void main(String[] args) {
        List<Employee1> employee1List= getEmployee();

        System.out.println("Before Sort");

        for(Employee1 emp:employee1List){
            System.out.println(emp);
        }

        System.out.println("AfterSort");


        //Apply comparator by using Lambda expression
        employee1List.sort(((o1, o2) -> o2.getAge()-o1.getAge()));

        //to print the list after sorting
        employee1List.forEach((employee1) -> System.out.println(employee1));
        System.out.println("AfterSortBy Name");

        employee1List.sort(((o1, o2) -> o2.getName().compareTo(o1.getName())));


        employee1List.forEach((employee2) -> System.out.println(employee2));


        System.out.println("AfterSortBy ID");

        employee1List.sort(((o1, o2) -> o2.getId()-o1.getId()));

        employee1List.forEach((employee2) -> System.out.println(employee2));



    }

    private static List<Employee1> getEmployee( ){

        List<Employee1> employeeList = new ArrayList<>();

        employeeList.add(new Employee1(1,"test",30));
        employeeList.add(new Employee1(3,"test1",50));
        employeeList.add(new Employee1(2,"test3",40));
        employeeList.add(new Employee1(4,"test2",60));
        employeeList.add(new Employee1(6,"test9",10));

        return  employeeList;
    }
}

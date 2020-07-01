package SynechronProblem;

/**
 * @author uttpal on Jun, 2020
 */

public class Employee {

    private int id;
    private String firstName;
    private int age;
    private String lastName;

    public Employee(int id, String firstName, int age, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}

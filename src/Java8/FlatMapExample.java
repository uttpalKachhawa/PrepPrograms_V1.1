package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 703238043 on Jul, 2020
 */

class Student {

    private String name;
    private Set<String> book;


    public Student() {

    }

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", book=" + book +
                '}';
    }

    public Student(String name, Set<String> book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }
}


public class FlatMapExample {

    public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?

        //Stream<String[]> stream=temp.filter(x->"a".equals(x.toString()));

        //stream.forEach(System.out::println);


        //Stream<String>, using FlatMap!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        Stream<String> streamflat = stringStream.filter(x -> "a".equals(x.toString()));

        streamflat.forEach(System.out::println);


        Student student = new Student();
        student.setName("uttpal");
        student.addBook("Java 8");
        student.addBook("Java 9");
        student.addBook("Java 10");

        Student student1 = new Student();
        student1.setName("Kachhawa");
        student1.addBook("Java 11");
        student1.addBook("Java 12");
        student1.addBook("Java 10");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        List<String> collect =
                studentList.stream().map(Student::getBook)
                        .flatMap(x -> x.stream())
                        .distinct()
                        .collect(Collectors.toList());


        collect.forEach(System.out::println);


    }
}

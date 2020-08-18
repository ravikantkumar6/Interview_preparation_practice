package com.java8.interfce1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ForEachDemo {
    public static void main(String args[]){

        List<Student> students = getListStudent()
                .stream()
                .filter(s->s.getId().compareTo("30") > 0)
                .collect(Collectors.toList());
        students.forEach(System.out::println);
        Predicate<Integer> p = I -> (I>10);
        System.out.println(p.test(20));

    }

    static List<Student> getListStudent(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ravi","1"));
        students.add(new Student("Ravi3","3"));
        students.add(new Student("Ravi5","5"));
        students.add(new Student("Ravi99","99"));
        students.add(new Student("Ravi44","44"));
        return students;
    }
}

class Student{
    private String name;
    private String id;

    public Student() {
        this.name = name;
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

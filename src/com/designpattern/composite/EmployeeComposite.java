package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite {
    private String name;
    private String dept;
    private int salary;
    private List<EmployeeComposite> subordinates;

    public EmployeeComposite(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(EmployeeComposite e) {
        subordinates.add(e);
    }

    public void remove(EmployeeComposite e) {
        subordinates.remove(e);
    }

    public List<EmployeeComposite> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }

    public void show(){
        System.out.println(this.toString());
        subordinates.forEach(employeeComposite -> employeeComposite.show());
    }

}

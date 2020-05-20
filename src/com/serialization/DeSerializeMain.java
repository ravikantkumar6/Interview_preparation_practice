package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeMain {

    public static void main(String[] args) throws IOException {
        Employee employee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee) objectInputStream.readObject();

        } catch (ClassNotFoundException | IOException fe) {
            fe.printStackTrace();
        }
        System.out.println("deserializing employee ...");
        System.out.println("Emp Id:->" + employee.getEmployeeId());
        System.out.println("Emp Name:->" + employee.getEmployeeName());
        System.out.println("Department:->" + employee.getDepartment());
    }

}

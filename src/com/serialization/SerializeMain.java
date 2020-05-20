package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Asu");
        employee.setDepartment("IT");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            fileOutputStream.close();
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

}

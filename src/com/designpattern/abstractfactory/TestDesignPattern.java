package com.designpattern.abstractfactory;

public class TestDesignPattern {

    public static void main(String... s) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2. GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }

}

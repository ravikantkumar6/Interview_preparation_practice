package com.designpattern.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {

    private final String ram;
    private final String hdd;
    private final String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createcomputer() {
        return new PC(ram, hdd, cpu);
    }

}

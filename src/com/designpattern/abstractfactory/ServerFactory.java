package com.designpattern.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

    private final String ram;
    private final String hdd;
    private final String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createcomputer() {
        return new Server(ram, hdd, cpu);
    }

}

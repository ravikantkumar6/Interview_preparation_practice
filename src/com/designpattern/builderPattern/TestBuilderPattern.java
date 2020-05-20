package com.designpattern.builderPattern;

public class TestBuilderPattern {

    public static void main(String... s) {
        Computer computer = new Computer.ComputerBuilder("500Gb", "4 GB").
                setGraphicCardEnabled(false).setBluetoothenabled(true).build();
    }

}

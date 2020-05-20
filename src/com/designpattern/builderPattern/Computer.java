package com.designpattern.builderPattern;

public class Computer {

    private String hdd;
    private String ram;
    private boolean graphicCardEnabled;
    private boolean bluetoothEnaled;

    private Computer(ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.graphicCardEnabled = computerBuilder.graphicCardEnabled;
        this.bluetoothEnaled = computerBuilder.bluetoothEnabled;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isGraphicCardEnabled() {
        return graphicCardEnabled;
    }

    public void setGraphicCardEnabled(boolean graphicCardEnabled) {
        this.graphicCardEnabled = graphicCardEnabled;
    }

    public boolean isBluetoothEnaled() {
        return bluetoothEnaled;
    }

    public void setBluetoothEnaled(boolean bluetoothEnaled) {
        this.bluetoothEnaled = bluetoothEnaled;
    }

    public static class ComputerBuilder {
        private final String hdd;
        private final String ram;
        private boolean graphicCardEnabled;
        private boolean bluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
            this.graphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothenabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}

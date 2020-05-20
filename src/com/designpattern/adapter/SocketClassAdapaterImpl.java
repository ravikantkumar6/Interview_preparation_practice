package com.designpattern.adapter;

public class SocketClassAdapaterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

}

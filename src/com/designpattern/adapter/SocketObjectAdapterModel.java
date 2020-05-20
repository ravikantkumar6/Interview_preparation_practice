package com.designpattern.adapter;

public class SocketObjectAdapterModel implements SocketAdapter{
	
	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt,10);
	}
	
	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt,40);
	}

}

package com.designpattern.prototype;

public interface PrototypeCapable extends Cloneable{
	public PrototypeCapable clone() throws CloneNotSupportedException;
}

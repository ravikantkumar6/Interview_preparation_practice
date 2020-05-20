package com.designpattern.prototype;

public class Show implements PrototypeCapable {

    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Show";
    }

    public Show clone() throws CloneNotSupportedException {
        System.out.println("cloning the show object");
        return (Show) super.clone();
    }
}

package com.designpattern.prototype;

public class Album implements PrototypeCapable {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Album";
    }

    public Album clone() throws CloneNotSupportedException {
        System.out.println("cloning the album object");
        return (Album) super.clone();
    }
}

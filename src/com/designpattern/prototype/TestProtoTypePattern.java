package com.designpattern.prototype;

import com.designpattern.prototype.PrototypeFactory.ModelType;

public class TestProtoTypePattern {
    public static void main(String... s) throws CloneNotSupportedException {
        String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
        System.out.println(moviePrototype);

        String albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
        System.out.println(albumPrototype);

        String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
        System.out.println(showPrototype);
    }
}

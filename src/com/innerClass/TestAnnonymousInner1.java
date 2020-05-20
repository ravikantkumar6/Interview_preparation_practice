package com.innerClass;

public class TestAnnonymousInner1 {
    public static void main(String... string) {
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Nice fruit");

            }

        };
        eatable.eat();
    }
}

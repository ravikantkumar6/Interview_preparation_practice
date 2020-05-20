package com.innerClass;

public class TestAnnonymousInner {

    public static void main(String[] args) {
        Person person = new Person() {

            @Override
            void eat() {
                System.out.println("Inside eat method");
            }

        };
        person.eat();
    }

}

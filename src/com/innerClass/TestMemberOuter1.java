package com.innerClass;

public class TestMemberOuter1 {

    private final int data = 30;

    public static void main(String... s) {
        TestMemberOuter1 testMemberOuter1 = new TestMemberOuter1();
        TestMemberOuter1.Inner inner = testMemberOuter1.new Inner();
        inner.msg();
    }

    class Inner {
        int data = 40;

        void msg() {
            System.out.println("data is:" + TestMemberOuter1.this.data);
        }
    }


}

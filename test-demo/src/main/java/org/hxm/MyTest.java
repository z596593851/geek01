package org.hxm;

public class MyTest {
    public static void main(String[] args) {
        new MyTest().foo();
    }
    public void foo() {
        bar1();
        bar2();
    }

    public void bar1() {
        System.out.println("1");
    }

    public void bar2() {
        System.out.println("2");
    }
}

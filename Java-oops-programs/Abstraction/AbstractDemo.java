abstract class A {
    A() {
        System.out.println("A class Constructor");
    }
    abstract void m1();
    final void m2() {
        System.out.println("Final Method m2 in A");
    }
}

class B extends A {
    B() {
        System.out.println("B class Constructor");
    }
    void m1() {
        System.out.println("Overriding m1 in class B");
    }
    void m2() {
        System.out.println("Final method m2 in B");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
    }
}

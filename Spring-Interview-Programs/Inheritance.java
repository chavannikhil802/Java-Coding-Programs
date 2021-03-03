class A {
    int i = 10;
    public void printValue() {
        System.out.println("A Value : "+i);
    }
}

class B extends A {
    int i = 20;
    public void printValue() {
        System.out.println("B Value : "+i);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        a.printValue();
        System.out.println("a.i : "+a.i);

        B b = new B();
        b.printValue();
        System.out.println("b.i : "+b.i);

        A ab = new B();
        ab.printValue();
        System.out.println("ab.i : "+ab.i);
    }
}
/* OUTPUT:-

A Value : 10
a.i : 10
B Value : 20
b.i : 20
B Value : 20
ab.i : 10

*/
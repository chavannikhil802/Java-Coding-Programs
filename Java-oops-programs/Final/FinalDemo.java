abstract final class A {
    A() {
        System.out.println("A class constructor");
    }
    abstract void m1() {
        System.out.println("m1() method");
    }
}

// class B extends A {
//     B() {
//         System.out.println("B class constructor");
//     }
// }

class FinalDemo {
    public static void main(String[] args) {
        A a = new A();
    }
}
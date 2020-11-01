// PROGRAM TO DEMONSTRATE METHOD OVERRIDING

// PARENT CLASS
class Parent {
    public void m1() {
        System.out.println("Parent Class Method");
    }
}
// CHILD CLASS
class Child extends Parent {
    public void m1() {
        System.out.println("Child Class Method");
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        //REFERENCE TYPE - PARENT & OBJECT TYPE - PARENT
        Parent p = new Parent();
        p.m1();
        //REFERENCE TYPE - CHILD & OBJECT TYPE - CHILD
        Child c = new Child();
        c.m1();
        // REFERENCE TYPE - PARENT & OBJECT TYPE - CHILD
        Parent p1 = new Child();
        p1.m1();
    }
}
// METHOD OVERRIDING CASE 5 - EXTENDING THE METHOD SCOPE

class Parent {
    void m1() {
        System.out.println("Parent Class - m1() method");
    }
}

class Child extends Parent {
    public void m1() {
        System.out.println("Child Class - m1() method");
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.m1();
        child.m1();
    }
}
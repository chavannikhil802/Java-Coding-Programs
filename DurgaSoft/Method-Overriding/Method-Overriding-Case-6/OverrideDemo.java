//METHOD OVERRIDING - STATIC METHODS

class Parent {
    // public static void m1() {
    //     System.out.println("Parent - Static m1 method");
    // }

    // public void m2() {
    //     System.out.println("Parent - Non-Static m2 method");
    // }

    public static void m3() {
        System.out.println("Parent - Static m3 method");
    }
}

class Child extends Parent{
    // public void m1() {
    //     System.out.println("Child - Non-Static m1 method");
    // }

    // public static void m2() {
    //     System.out.println("Child - Static m2 method");
    // }

    public static void m3() {
        System.out.println("Child - Static m3 method");
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // parent.m1();
        // parent.m2();
        Parent.m3();

        // child.m1();
        // child.m2();
        Child.m3();
    }
}
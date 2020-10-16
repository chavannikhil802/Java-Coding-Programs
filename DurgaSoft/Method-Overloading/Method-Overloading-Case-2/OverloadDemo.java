// PROGRAM TO DEMONSTRATE CLASS PRIORITY IN METHOD OVERLOADING

class OverloadDemo {
    // Object Version of method
    void m1(Object o) {
        System.out.println("Method - Object Version.");
    }
    // String version of method
    void m1(String s) {
        System.out.println("Method - String Version.");
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        System.out.println();
        // VALID FOR OBJECT CLASS
        demo.m1(new Object());
        // VALID FOR STRING CLASS
        demo.m1("Method Overloading");
        // VALID FOR BOTH OBJECT CLASS AND STRING CLASS
        demo.m1(null);
        System.out.println();
    }
}
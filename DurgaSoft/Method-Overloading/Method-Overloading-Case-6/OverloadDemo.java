// METHOD OVERLOADING CASE 6 - VARIABLE ARGUMENT METHOD

class OverloadDemo {
    // GENERAL METHOD
    public void m1(int i) {
        System.out.println("\nGeneral Method");
    }
    // VARIABLE ARGUMENT METHOD
    public void m1(int ... i) {
        System.out.println("\nVariable Argument Method");
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        demo.m1();
        demo.m1(1111);
        demo.m1(1111,2222);
        demo.m1(1111,2222,3333);
        System.out.println();
    }
}
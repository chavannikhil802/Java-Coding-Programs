// METHOD OVERLOADING CASE 3 - SAME APPLICABLE ARGUMENT TYPE FOR DIFFERENT CLASSES

class OverloadDemo {
    // STRING VERSION OF m1
    public void m1(String s) {
        System.out.println("Method - String Version");
    }
    // STRING BUFFER VERSION OF m1
    public void m1(StringBuffer s) {
        System.out.println("Method - String Buffer Version");
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        demo.m1("String");
        demo.m1(new StringBuffer("String Buffer"));
        demo.m1(null);

    }
}
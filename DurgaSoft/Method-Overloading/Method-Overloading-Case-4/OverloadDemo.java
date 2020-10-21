class OverloadDemo {
    // FLOAT - INTEGER VERSION
    void m1(float a, int b) {
        System.out.println("a : "+a+" and b : "+b);
        System.out.println("Method m1() - Float - Integer Version");
    }
    // INTEGER - FLOAT VERSION
    void m1(int a, float b) {
        System.out.println("a : "+a+" and b : "+b);
        System.out.println("Method m1() - Integer - Float Version");
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        demo.m1(11.11f, 11);
        demo.m1(11, 11.11f);
//        demo.m1(11, 11);
//        demo.m1(11.11, 11.11);
    }
}
// PROGRAM TO DEMONSTRATE METHOD OVERLOADING

class Demo {
    // METHOD THAT ACCEPTS INTEGER PARAMETER
    void number(int num) {
        System.out.println("Inside Integer number method : "+num);
    }
    // METHOD THAT ACCEPTS FLOAT PARAMETER
    void number(float num) {
        System.out.println("Inside Float number method : "+num);
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.number('a');
        demo.number(100);
        demo.number(111.111f);
        demo.number(111.111);
    }
}
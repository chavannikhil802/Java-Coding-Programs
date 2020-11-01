// METHOD OVERRIDING RULE 1 - METHOD SIGANTURES MUST BE SAME

class Parent {
    public void m1(int i) {
        System.out.println("Parent Class m1() - Integer Method");
    }

    public void m2(int i) {
        System.out.println("Parent Class m2() - Integer Method");
    }
}

class Child extends Parent {
    public void m1(int i) {
        System.out.println("Child Class m1() - Integer Method");
    }

    public void m2(float i) {
        System.out.println("Child Class m2() - Float Method");
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.m1(1111);
        p.m2(1111);
        c.m1(1111);
        c.m2(1111.1111f);

        System.out.println();
        
        Parent p1 = new Child();
        p1.m1(1111);
        p1.m2(1111.1111f);
    }
}
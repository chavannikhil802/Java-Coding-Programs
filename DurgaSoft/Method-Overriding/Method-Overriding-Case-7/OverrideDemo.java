// METHOD OVERRIDING CASE 7 - VARIABLE HIDING

class Parent {
    static String str = "Parent Class String";
}

class Child extends Parent {
   String str = "Child Class String";
}

class OverrideDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parent1 = new Child();

        System.out.println("\n"+parent.str);
        System.out.println(child.str);
        System.out.println(parent1.str+"\n");
    }
}
interface In1 {
    final int a = 10;

    default void display() {
        System.out.println("Interface");
    }
}

class InterfaceDemo implements In1 {
    public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo();
        id.display();
    }
}
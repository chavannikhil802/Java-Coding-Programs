// PROGRAM TO DEMONSTRATE METHOD OVERLOADING

class Addition {
    // ADDING INTEGER VARIABLES
    int add(int num1, int num2) {
        return num1 + num2;
    }
    // ADDING LONG VARIABLES
    long add (long num1, long num2) {
        return num1 + num2;
    }
    // ADDING FLOAT VARIABLES
    float add (float num1, float num2) {
        return num1 + num2;
    }
    // ADDING DOUBLE VARIABLES
    double add(double num1, double num2) {
        return num1 + num2;
    }
    // ADDING INT, LONG, FLOAT, DOUBLE VARIABLES
    double add (int num1, long num2, float num3, double num4) {
        return num1 + num2 + num3 + num4;
    }
    // ADDING 4 INTEGERS
    int add (int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println();
        System.out.println("Adding 2 integer variables 10 + 20 = "+addition.add(10, 20)+"\n");
        System.out.println("Adding 2 long variables 10 + 20 = "+addition.add(10l, 20l)+"\n");
        System.out.println("Adding 2 flaot variables 10.5f + 20.5f = "+addition.add(10.5f, 20.5f)+"\n");
        System.out.println("Adding 2 double variables 10.5 + 20.5 = "+addition.add(10.5, 20.5)+"\n");
        System.out.println("Adding integer, long, flaot and double variables 10 + 20l + 30.5f + 40.5 = "
                            +addition.add(10, 20l,30.5f, 40.5)+"\n");
        System.out.println("Adding 4 integers 1 + 2 + 3 + 4 = "+addition.add(1,2,3,4)+"\n");
    }
}
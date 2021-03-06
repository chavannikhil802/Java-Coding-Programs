// PROGRAM TO DEMONSTRATE THE IMPLEMNTATION OF ABSTRACT CLASS AND ABSTRACT METHODS

// ABSTRACT CLASS
abstract class AbstractArithmeticFunctions {

    // ABSTRACT METHODS
    // HERE, WE ONLY HAVE METHODS DECLARATION
    // AND NO METHOD IMPLEMENTATION
    abstract int multiplication(int num1, int num2);
    abstract int division(int num1, int num2);

    // HERE, WE HAVE A NON-ABSTRACT METHOD
    // WHICH IS IMPLEMENTED IN THE ABSTACT CLASS
    int addition(int num1, int num2) {
        System.out.print("\nIn Abstract Parent Class : ");
        return num1 + num2;
    }
    // IMPLEMENTING THE SUBTRACTION METHOD
    int subtraction(int num1, int num2) {
        System.out.print("\nIn Abstract Parent Class : ");
        return num1 - num2;
    }
}
// IN ORDER TO IMPLEMENT THE ABSTRACT METHODS, WE MUST FIRST CREATE
// A NEW CHILD CLASS OF THE ABSTRACT CLASS AND THEN, WE IMPLEMENT
// THE ABSTRACT METHODS IN THE CHILD CLASS
class ArithmeticFunctions extends AbstractArithmeticFunctions {

    // IMPLEMENTING THE MULTIPLICATION METHOD
    int multiplication(int num1, int num2) {
        System.out.print("\nIn Child Class : ");
        return num1 * num2;
    }
    // IMPLEMENTING THE DIVISION METHOD
    int division(int num1, int num2) {
        System.out.print("\nIn Child Class : ");
        return num1 / num2;
    }
}
// MAIN CLASS
class AbstractClassDemo {
    public static void main(String[] args) {
        // CREATING AN OBJECT OF THE CHILD CLASS
        ArithmeticFunctions functions = new ArithmeticFunctions();
        // IMPLEMENTING THE METHODS FROM THE CHILD CLASS
        System.out.println("10 + 5 = "+functions.addition(10,5));
        System.out.println("10 - 5 = "+functions.subtraction(10,5));
        System.out.println("10 * 5 = "+functions.multiplication(10,5));
        System.out.println("10 / 5 = "+functions.division(10,5)+"\n");
    }
}

// OUTPUT:-

// In Abstract Parent Class : 10 + 5 = 15

// In Abstract Parent Class : 10 - 5 = 5

// In Child Class : 10 * 5 = 50

// In Child Class : 10 / 5 = 2
// PROGRAM TO DEMONSTRATE ABSTRACT CLASS AND ABSTRACT METHODS

// ABSTRACT CLASS
abstract class AbstractArithmeticFunctions {

    // ABSTRACT METHODS
    // HERE, WE ONLY HAVE METHODS DECLARATION
    // AND NO METHOD IMPLEMENTATION
    abstract int addition(int num1, int num2);
    abstract int subtraction(int num1, int num2);
    abstract int multiplication(int num1, int num2);
    abstract int division(int num1, int num2);
}
// IN ORDER TO IMPLEMENT THE ABSTRACT METHODS, WE MUST FIRST CREATE
// A NEW CHILD CLASS OF THE ABSTRACT CLASS AND THEN, WE IMPLEMENT
// THE ABSTRACT METHODS IN THE CHILD CLASS
class  ArithmeticFunctions extends AbstractArithmeticFunctions {
    // IMPLEMENTING THE ADDITION METHOD
    int addition(int num1, int num2) {
        return num1 + num2;
    }
    // IMPLEMENTING THE SUBTRACTION METHOD
    int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    // IMPLEMENTING THE MULTIPLICATION METHOD
    int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    // IMPLEMENTING THE DIVISION METHOD
    int division(int num1, int num2) {
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
        System.out.println("10 / 5 = "+functions.division(10,5));
    }
}

// OUTPUT:-

// 10 + 5 = 15
// 10 - 5 = 5
// 10 * 5 = 50
// 10 / 5 = 2
// PROGRAM TO DEMONSTRATE THE DECLARATION OF MULTIPLE CLASSES WITH MAIN METHOD 
// WITH ONE CLASS PUBLIC IN THE SAME PROGRAM.
// IN THIS CASE, THE NAME OF THE PROGRAM FILE AND THE PUBLIC CLASS MUST BE SAME.
// HERE, WE HAVE NAMED THE FILE AS MultipleClassPublic.java
// AND THE PUBLIC CLASS IS ALSO NAMED AS MultipleClassPublic

public class MultipleClassPublic {
    public static void main(String[] args) {
        System.out.println("In Class MultipleClassPublic of MultipleClassPublic.java");
    }
}
class L {
    public static void main(String[] args) {
        System.out.println("In Main Method of Class L of MultipleClassPublic.java");
    }
}
class M {
    public static void main(String[] args) {
        System.out.println("In Main Method of Class M of MultipleClassPublic.java");
    }
}
class N {
    public static void main(String[] args) {
        System.out.println("In Main Method of Class N of MultipleClassPublic.java");
    }
}
class O {
    public static void main(String[] args) {
        System.out.println("In Main Method of Class O of MultipleClassPublic.java");
    }
}
class P {
    public static void main(String[] args) {
        System.out.println("In Main Method of Class P of MultipleClassPublic.java");
    }
}
class Q {
    public static void main(String[] args) {
        System.out.println("In Main Method of Class Q of MultipleClassPublic.java");
    }
}

// OUTPUT:-

// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> javac MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java MultipleClassPublic      
// In Class MultipleClassPublic of MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java L
// In Main Method of Class L of MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java M
// In Main Method of Class M of MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java N
// In Main Method of Class N of MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java O
// In Main Method of Class O of MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java P
// In Main Method of Class P of MultipleClassPublic.java
// PS D:\Java-Coding\DurgaSoft\Multiple-Classes-in-single-Program-File> java Q
// In Main Method of Class Q of MultipleClassPublic.java
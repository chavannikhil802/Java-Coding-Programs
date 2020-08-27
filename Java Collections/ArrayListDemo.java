import java.util.ArrayList;

// PROGRAM TO DEMONSTRATE THE USE OF ARRAYLIST

class ArrayListDemo {
    public static void main(String[] args) {
        // CREATE AN ARRAY LIST
        ArrayList<String> a1 = new ArrayList<String>();

        // DISPALYING THE INITIAL SIZE OF THE ARRAYLIST
        System.out.println("Initial size of a1 : "+a1.size());

        // ADDING ELEMENTS TO THE ARRAYLIST
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        a1.add("E");
        a1.add("F");

        System.out.println("Size of a1 after adding elements to it : "+a1.size());

        // DISPLAYING THE CONTENTS OF A1
        System.out.println("Contents of a1 : "+a1);

        // ADDING ELEMENTS AFTER "C" (3rd POSITION)
        a1.add(3,"X");
        a1.add(4,"Y");
        a1.add(5,"Z");

        System.out.println("Size of a1 after adding elements after 'C' : "+a1.size());

        // DISPLAYING THE CONTENTS OF A1
        System.out.println("Contents of a1 : "+a1);

        // REMOVING THE RECENTLY ADDED ELEMENTS
        a1.remove("X");
        a1.remove("Y");
        a1.remove("Z");

        System.out.println("Size of a1 after removing elements : "+a1.size());

        // DISPLAYING THE CONTENTS OF A1
        System.out.println("Contents of a1 : "+a1);
    }
}
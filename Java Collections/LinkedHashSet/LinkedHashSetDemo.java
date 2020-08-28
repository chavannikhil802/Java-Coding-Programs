// PROGRAM TO IMPEMENT LINKED HASH SET

import java.util.LinkedHashSet;

class LinkedHashSetDemo {
    public static void main(String[] args) {
        
        // CREATING A NEW LINKED HASH SET
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        // ADDING ELEMENTS
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        lhs.add("G");
        lhs.add("H");

        // PRINTING SIZE OF LINKED HASH SET
        System.out.println("\nSize of LinkedHashSet : "+lhs.size());
        // PRINTING CONTENTS OF LINKED HASH SET
        System.out.println("Contents of LinkedHashSet : "+lhs+"\n");

        // REMOVING ELEMENTS
        lhs.remove("B");
        lhs.remove("D");
        lhs.remove("F");
        lhs.remove("H");

        // PRINTING SIZE OF LINKED HASH SET
        System.out.println("Size of LinkedHashSet : "+lhs.size());
        // PRINTING CONTENTS OF LINKED HASH SET
        System.out.println("Contents of LinkedHashSet after removing the elements : "+lhs+"\n");
    }
}
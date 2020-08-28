import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        
        // CREATE A NEW HASHSET
        HashSet<String> hs = new HashSet<String>();

        // ADDING ELEMENTS TO THE HASHSET
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");
        hs.add("G");
        hs.add("H");

        // DISPLAYING THE CONTENTS OF HASHSET
        System.out.println("Contents of the HashSet : "+hs);
    }
}
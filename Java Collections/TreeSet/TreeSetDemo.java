import java.util.TreeSet;

// PROGRAM TO DEMONSTRATE THE USE OF TREESET

class TreeSetDemo {
    public static void main(String[] args) {
        
        // CREATING A TREESET FOR STRING
        TreeSet<String> ts1 = new TreeSet<String>();

        // ADDING ELEMENTS
        ts1.add("Z");
        ts1.add("Y");
        ts1.add("X");
        ts1.add("W");
        ts1.add("V");
        ts1.add("U");

        // DISPLAYING THE SIZE OF ts1
        System.out.println("\nSize of ts1 : "+ts1.size());
        // DISPAYING THE CONTENTS OF ts1
        System.out.println("Contents of ts1 : "+ts1);

        // REMOVING THE ELEMENTS OF ts1
        ts1.remove("W");
        ts1.remove("X");

        // DISPLAYING THE SIZE OF ts1
        System.out.println("\nSize of ts1 : "+ts1.size());
        // DISPAYING THE CONTENTS OF ts1
        System.out.println("Contents of ts1 after deleting the elements : "+ts1);

        // CREATING A TREESET FOR INTEGERS
        TreeSet<Integer> ts2 = new TreeSet<Integer>();

        // ADDING ELEMENTS
        ts2.add(10);
        ts2.add(9);
        ts2.add(8);
        ts2.add(7);
        ts2.add(6);
        ts2.add(5);
        ts2.add(4);
        ts2.add(3);
        ts2.add(2);
        ts2.add(1);

        // DISPLAYING THE SIZE OF ts2
        System.out.println("\nSize of ts2 : "+ts2.size());
        // DISPAYING THE CONTENTS OF ts2
        System.out.println("Contents of ts2 : "+ts2+"\n");

        //  REMOVING TH ELEMENTS OF ts2
        ts2.remove(4);
        ts2.remove(6);
        ts2.remove(5);
        ts2.remove(3);

        System.out.println("\nSize of ts2 : "+ts2.size());
        // DISPAYING THE CONTENTS OF ts2
        System.out.println("Contents of ts2 after deleting the elements : "+ts2+"\n");
    }
}
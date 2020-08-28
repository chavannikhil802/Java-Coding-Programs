import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        
        // CREATE A NEW LINKEDLIST
        LinkedList<String> l1 = new LinkedList<String>();

        // ADD ELEMENTS TO THE LINKEDLIST
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        l1.add("F");
        // ADD ELEMENT TO THE START OF THE LINKEDLIST
        l1.addFirst("Y");
        // ADD ELEMENT TO THE END OF THE LINKEDLIST
        l1.addLast("Z");
        // ADD ELEMENT AT INDEX NO. 4
        l1.add(4, "O");

        System.out.println("Original contents of l1 : "+l1);

        // REMOVE FIRST ELEMENT
        l1.removeFirst();
        // REMOVE LAST ELEMENT
        l1.removeLast();
        // REMOVE THE ELEMENT AT INDEX 3
        l1.remove(3);

        System.out.println("Contents of l1 after deleting the first, last and element at 3rd position : "+l1);

        // GETTING AND SETTING A SPECIFIC VALUE
        String str = l1.get(3);
        l1.set(3, str+"updated");

        System.out.println("Contents of l1 after updating the value at index 3 : "+l1);
        System.out.println("Size of LinkedList : "+l1.size());
    }
}
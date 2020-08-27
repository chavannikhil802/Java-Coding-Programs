import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int sum = 0;

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        // PRINTING THE SIZE OF ARRAYLIST
        System.out.println("\nSize of ArrayList is "+arrayList.size());

        // PRINTING THE CONTENTS OF THE ARRAYLIST
        System.out.println("Contents of the ArrayList are : "+arrayList);

        // CREATING ARRAY OF TYPE INTEGER
        Integer intArray[] = new Integer[arrayList.size()];

        System.out.println("Converting the ArrayList to Array..........");

        // CONVERTING ARRAYLIST TO ARRAY
        intArray = arrayList.toArray(intArray);

        // PRINTING THE CONTENTS OF THE ARRAY
        System.out.print("Contents of the array are :[");
        for(int i : intArray) {
            System.out.print(i+" ");
        }
        System.out.println("\b]");

        // ACCESSING THE ELEMENTS OF THE ARRAY AND ADDING THEM
        for(int i : intArray) {
            sum += i;
        }
        System.out.println("Sum = "+sum+"\n");
    }
}
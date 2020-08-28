// MENU DRIVEN PROGRAM TO DISPLAY THE USE OF LINKEDLIST

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0, value = 0, index = 0;

        // CREATE A NEW LINKEDLIST
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        do {
            //USER MENU
            System.out.println("\n-----------------------------------------------------");
            System.out.println("MENU FOR USING LINKEDLIST FOR INTEGER ELEMENTS ONLY");
            System.out.println("-----------------------------------------------------");
            System.out.println("1 - Display the Size of LinkedList");
            System.out.println("2 - Adding elements at the Start of the LinkedList");
            System.out.println("3 - Adding elements at the End of the LinkedList");
            System.out.println("4 - Adding elements at any position of the LinkedList");
            System.out.println("5 - Removing elements from the Start of the LinkedList");
            System.out.println("6 - Removing elements from the End of the LinkedList");
            System.out.println("7 - Removing elements from any position of the LinkedList");
            System.out.println("8 - Update the element of the LinkedList");
            System.out.println("9 - Display the contents of the LinkedList");
            System.out.println("10 - EXIT");
            System.out.print("\nEnter your Option : ");

            // ACCEPTING THE OPTION FROM THE USER
            choice = input.nextInt();

            switch(choice) {
                // 1 - Display the Size of LinkedList
                case 1:
                    System.out.println("\n----------OPTION 1----------\n");

                        System.out.println("Size of LinkedList : "+linkedList.size());

                    System.out.println("\n----------OPTION 1----------\n");
                    break;

                // 2 - Adding elements at the Start of the LinkedList
                case 2:
                    System.out.println("\n----------OPTION 2----------\n");

                        System.out.print("Enter the Integer : ");
                        value = input.nextInt();
                        linkedList.addFirst(value);

                    System.out.println("\n----------OPTION 2----------\n");
                    break;

                // 3 - Adding elements at the End of the LinkedList
                case 3:
                    System.out.println("\n----------OPTION 3----------\n");

                        System.out.print("Enter the Integer : ");
                        value = input.nextInt();
                        linkedList.addLast(value);

                    System.out.println("\n----------OPTION 3----------\n");
                    break;

                // 4 - Adding elements at any position of the LinkedList
                case 4:
                    System.out.println("\n----------OPTION 4----------\n");

                        System.out.print("Enter the Index where you want to enter the Integer : ");
                        index = input.nextInt();
                        System.out.print("Enter the Integer : ");
                        value = input.nextInt();
                        linkedList.add(index, value);

                    System.out.println("\n----------OPTION 4----------\n");
                    break;

                // 5 - Removing elements from the Start of the LinkedList
                case 5:
                    System.out.println("\n----------OPTION 5----------\n");

                        linkedList.removeFirst();
                        System.out.println("Element Removed from the Starting Position.....");

                    System.out.println("\n----------OPTION 5----------\n");
                    break;

                // 6 - Removing elements from the End of the LinkedList
                case 6:
                    System.out.println("\n----------OPTION 6----------\n");

                        linkedList.removeLast();
                        System.out.println("Element Removed from the Ending Position.....");

                    System.out.println("\n----------OPTION 6----------\n");
                    break;

                // 7 - Removing elements from any position of the LinkedList
                case 7:
                    System.out.println("\n----------OPTION 7----------\n");

                        System.out.print("Enter the Index from where you want to remove the Integer : ");
                        index = input.nextInt();
                        linkedList.remove(index);

                    System.out.println("\n----------OPTION 7----------\n");
                    break;

                // 8 - Update the element of the LinkedList
                case 8:
                    System.out.println("\n----------OPTION 8----------\n");

                        System.out.print("Enter the Index where you want to update the Integer : ");
                        index = input.nextInt();
                        System.out.print("Enter the Updated Integer : ");
                        value = input.nextInt();

                        linkedList.set(index, value);

                    System.out.println("\n----------OPTION 8----------\n");
                    break;

                // 9 - Display the contents of the LinkedList
                case 9:
                    System.out.println("\n----------OPTION 9----------\n");

                        System.out.println("Contents of LinkedList : "+linkedList);

                    System.out.println("\n----------OPTION 9----------\n");
                    break;

                // EXIT
                case 10: System.out.println("\nTHANK YOU!!!!\n"); break;

                // If any other number is entered
                default: System.out.println("\nERROR! PLEASE ENTER A VALID OPTION\n"); break;
            }
        }
        while(choice!=10);
        input.close();
    }
}
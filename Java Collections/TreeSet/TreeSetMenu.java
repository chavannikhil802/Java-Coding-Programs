// MENU-DRIVEN PROGRAM TO DEMONSTRATE THE USE OF TREESET

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetMenu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice = 0;

        // CREATING A TREESET
        TreeSet<String> treeSet = new TreeSet<String>();

        do {
            // USER MENU
            System.out.println("\n-----------------------------------------------------");
            System.out.println("MENU FOR USING TREESET FOR STRING ELEMENTS ONLY");
            System.out.println("-----------------------------------------------------");
            System.out.println("1 - Display the Size of TreeSet");
            System.out.println("2 - Display the contents of the TreeSet");
            System.out.println("3 - Adding elements to the TreeSet");
            System.out.println("4 - Removing elements from the TreeSet");
            System.out.println("5 - EXIT");
            System.out.print("\nEnter your Option : ");

            // ACCEPTING THE OPTION FROM THE USER
            choice = input.nextInt();

            switch(choice) {
                // 1 - Display the Size of TreeSet
                case 1:
                    System.out.println("\n----------OPTION 1----------\n");

                        System.out.println("Size of HashSet : "+treeSet.size());

                    System.out.println("\n----------OPTION 1----------\n");
                    break;

                // 2 - Display the contents of the TreeSet
                 case 2:
                    System.out.println("\n----------OPTION 2----------\n");

                        System.out.println("Contents of HashSet : "+treeSet);

                    System.out.println("\n----------OPTION 2----------\n");
                    break;

                // 3 - Adding elements to the TreeSet
                case 3:
                    System.out.println("\n----------OPTION 3----------\n");

                        System.out.print("Enter the String : ");
                        treeSet.add(input.next());

                    System.out.println("\n----------OPTION 3----------\n");
                    break;
                // 4 - Removing elements from the TreeSet
                case 4:
                    System.out.println("\n----------OPTION 4----------\n");

                        System.out.println("Contents of HashSet : "+treeSet);
                        System.out.print("Enter the element that you want to delete the String : ");
                        treeSet.remove(input.next());

                    System.out.println("\n----------OPTION 4----------\n");
                    break;

                // 5 - EXIT 
                case 5: System.out.println("\nTHANK YOU!!!!\n"); break;

                // If any other number is entered
                default: System.out.println("\nERROR! PLEASE ENTER A VALID OPTION\n"); break;
            }
        }
        while(choice != 5);
        input.close();


    }
}
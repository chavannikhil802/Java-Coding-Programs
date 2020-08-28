// MENU DRIVEN PROGRAM TO DISPLAY THE USE OF HASHSET

import java.util.HashSet;
import java.util.Scanner;

public class HashSetMenu {
    public static void main(String[] args) {
        
        // CREATE A NEW HASHSET
        HashSet<String> hashSet = new HashSet<String>();
        int choice = 0;

        Scanner input = new Scanner(System.in);

        do {
            // USER MENU
            System.out.println("\n-----------------------------------------------------");
            System.out.println("MENU FOR USING HASHSET FOR STRING ELEMENTS ONLY");
            System.out.println("-----------------------------------------------------");
            System.out.println("1 - Display the Size of HashSet");
            System.out.println("2 - Display the contents of the HashSet");
            System.out.println("3 - Adding elements to the HashSet");
            System.out.println("4 - Removing elements from the HashSet");
            System.out.println("5 - EXIT");
            System.out.print("\nEnter your Option : ");

            // ACCEPTING THE OPTION FROM THE USER
            choice = input.nextInt();

            switch(choice) {
                // 1 - Display the Size of HashSet
                case 1:
                    System.out.println("\n----------OPTION 1----------\n");

                        System.out.println("Size of HashSet : "+hashSet.size());

                    System.out.println("\n----------OPTION 1----------\n");
                    break;

                // 2 - Display the contents of the HashSet
                 case 2:
                    System.out.println("\n----------OPTION 2----------\n");

                        System.out.println("Contents of HashSet : "+hashSet);

                    System.out.println("\n----------OPTION 2----------\n");
                    break;

                // 3 - Adding elements to the HashSet
                case 3:
                    System.out.println("\n----------OPTION 3----------\n");

                        System.out.print("Enter the String : ");
                        hashSet.add(input.next());

                    System.out.println("\n----------OPTION 3----------\n");
                    break;
                // 4 - Removing elements from the HashSet
                case 4:
                    System.out.println("\n----------OPTION 4----------\n");

                        System.out.println("Contents of HashSet : "+hashSet);
                        System.out.print("Enter the element that you want to delete the String : ");
                        hashSet.remove(input.next());

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
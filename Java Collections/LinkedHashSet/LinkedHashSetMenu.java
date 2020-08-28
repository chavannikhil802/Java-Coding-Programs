import java.util.LinkedHashSet;
import java.util.Scanner;

// MENU DRIVEN PROGRAM TO DISPALY THE IMPLEMENTATION OF INKED HASH SET

public class LinkedHashSetMenu {
    public static void main(String[] args) {
        
        // CREATING A NEW LINKED HASH SET
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        int choice = 0;

        Scanner input = new Scanner(System.in);

        do {
            // USER MENU
            System.out.println("\n-----------------------------------------------------");
            System.out.println("MENU FOR USING LINKEDHASHSET FOR STRING ELEMENTS ONLY");
            System.out.println("-----------------------------------------------------");
            System.out.println("1 - Display the Size of LinkedHashSet");
            System.out.println("2 - Display the contents of the LinkedHashSet");
            System.out.println("3 - Adding elements to the LinkedHashSet");
            System.out.println("4 - Removing elements from the LinkedHashSet");
            System.out.println("5 - EXIT");
            System.out.print("\nEnter your Option : ");

            // ACCEPTING THE OPTION FROM THE USER
            choice = input.nextInt();

            switch(choice) {
                // 1 - Display the Size of LinkedHashSet
                case 1:
                    System.out.println("\n----------OPTION 1----------\n");

                        System.out.println("Size of LinkedHashSet : "+linkedHashSet.size());

                    System.out.println("\n----------OPTION 1----------\n");
                    break;

                // 2 - Display the contents of the LinkedHashSet
                    case 2:
                    System.out.println("\n----------OPTION 2----------\n");

                        System.out.println("Contents of LinkedHashSet : "+linkedHashSet);

                    System.out.println("\n----------OPTION 2----------\n");
                    break;

                // 3 - Adding elements to the LinkedHashSet
                case 3:
                    System.out.println("\n----------OPTION 3----------\n");

                        System.out.print("Enter the String : ");
                        linkedHashSet.add(input.next());

                    System.out.println("\n----------OPTION 3----------\n");
                    break;
                // 4 - Removing elements from the LinkedHashSet
                case 4:
                    System.out.println("\n----------OPTION 4----------\n");

                        System.out.println("Contents of LinkedHashSet : "+linkedHashSet);
                        System.out.print("Enter the element that you want to delete the String : ");
                        linkedHashSet.remove(input.next());

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
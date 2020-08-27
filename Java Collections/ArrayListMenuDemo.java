import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMenuDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        ArrayList<String> array = new ArrayList<>();

        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("MENU FOR USING ARRAYLIST FOR STRING ELEMENTS ONLY");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Display the Size of ArrayList");
            System.out.println("2 - Adding elements in the ArrayList");
            System.out.println("3 - Display the contents of the ArrayList");
            System.out.println("4 - Removing elements from the ArrayList");
            System.out.println("5 - EXIT");
            System.out.print("\nEnter your Option : ");

            choice = input.nextInt();

            switch(choice) {

                case 1: 
                    System.out.println("\n----------OPTION 1----------\n");

                        System.out.println("Size of ArrayList is : "+array.size());

                    System.out.println("\n----------OPTION 1----------\n");
                    break;

                case 2:
                    System.out.println("\n----------OPTION 2----------\n");

                        System.out.print("Enter the number of Strings that you want to enter : ");
                        int strings = input.nextInt();
                        for(int i=0;i<strings;i++) {
                            System.out.print("Enter the String : ");
                            array.add(input.next());
                        }

                    System.out.println("\n----------OPTION 2----------\n");
                    break;

                case 3:
                    System.out.println("\n----------OPTION 3----------\n");

                        System.out.println("Contents of the ArrayList are :- ");
                        System.out.println(array);

                    System.out.println("\n----------OPTION 3----------\n");
                    break;

                case 4: 
                    System.out.println("\n----------OPTION 4----------\n");

                        System.out.println("Enter the index of element that you want to remove.");
                        System.out.println("Note: index starts from zero and ends at "+(array.size()-1));
                        System.out.print("Index : ");
                        int index = input.nextInt();

                        if(index < 0 || index >= array.size()) {
                            System.out.print("Please enter the index between zero and "+(array.size()-1)+"\n");
                        }
                        else {
                            array.remove(index);
                            System.out.println("Element at index no. "+index+" is removed!!!!\n");
                        }
                        
                    System.out.println("\n----------OPTION 4----------\n");
                    break;

                case 5: System.out.println("\nTHANK YOU!!!!\n"); break;

            }
        }
        while(choice != 5);
        input.close();
    }
}
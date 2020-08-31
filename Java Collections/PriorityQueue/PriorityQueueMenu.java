import java.util.PriorityQueue;
import java.util.Scanner;

class PriorityQueueMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        
        do {
            // USER MENU
            System.out.println("\n-----------------------------------------------------");
            System.out.println("MENU FOR USING HASHSET FOR INTEGER ELEMENTS ONLY");
            System.out.println("-----------------------------------------------------");
            System.out.println("1 - Display the Size of PriorityQueue");
            System.out.println("2 - Display the contents of PriorityQueue");
            System.out.println("3 - Adding elements to PriorityQueue");
            System.out.println("4 - Removing elements from PriorityQueue");
            System.out.println("5 - Fetching head of the PriorityQueue using peek()");
            System.out.println("6 - Removing head of the PriorityQueue using poll()");
            System.out.println("7 - EXIT");
            System.out.print("\nEnter your Option : ");

            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("\n----------OPTION 1----------\n");

                        System.out.println("Size of PriorityQueue : "+pQueue.size());

                    System.out.println("\n----------OPTION 1----------\n");
                    break;

                case 2:
                    System.out.println("\n----------OPTION 2----------\n");

                        System.out.println("Contents of PriorityQueue : "+pQueue);

                    System.out.println("\n----------OPTION 2----------\n");
                    break;
                
                case 3:
                    System.out.println("\n----------OPTION 3----------\n");

                        System.out.print("Enter the number of elements you want to add : ");
                        int count = input.nextInt();
                        for(int i=0;i<count;i++) {
                            System.out.print("Enter the Element : ");
                            int element = input.nextInt();
                            pQueue.add(element);
                        }

                    System.out.println("\n----------OPTION 3----------\n");
                    break;

                case 4:
                    System.out.println("\n----------OPTION 4----------\n");

                        System.out.println("Contents of PriorityQueue : "+pQueue);
                        System.out.print("Entee the element you want to remove : ");
                        pQueue.remove(input.nextInt());

                    System.out.println("\n----------OPTION 4----------\n");
                    break;

                case 5:
                    System.out.println("\n----------OPTION 5----------\n");

                        System.out.println("Head of the PriorityQueue : "+pQueue.peek());

                    System.out.println("\n----------OPTION 5----------\n");
                    break;

                case 6:
                    System.out.println("\n----------OPTION 6----------\n");

                        System.out.println("Contents of PriorityQueue before executing poll() : "+pQueue);
                        pQueue.poll();
                        System.out.println("Contents of PriorityQueue after executing poll() : "+pQueue);

                    System.out.println("\n----------OPTION 6----------\n");
                    break;

                // 7 - EXIT 
                case 7: System.out.println("\nTHANK YOU!!!!\n"); break;

                // If any other number is entered
                default: System.out.println("\nERROR! PLEASE ENTER A VALID OPTION\n"); break;
            }
        }
        while(choice!=7);
        input.close();
    }
}
import java.util.PriorityQueue;

class PriorityQueueDemo {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // ADDING ELEMENTS TO THE PRIORITYQUEUE
        pQueue.add(9);
        pQueue.add(8);
        pQueue.add(7);
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(12);
        pQueue.add(11);
        pQueue.add(10);
        pQueue.add(3);
        pQueue.add(4);
        pQueue.add(5);
        pQueue.add(6);
        pQueue.add(0);

        // DISPLAYING THE CONTENTS OF THE PRIORITYQUEUE
        System.out.println("Displaying the contents of the PriorityQueue : "+pQueue);

        // DISPLAYING THE HEAD OF THE QUEUE USING peek()
        System.out.println("Displaying the head of the PriorityQueue using peek() : "+pQueue.peek());

        // REMOVING THE TOP ELEMENT USING poll()
        pQueue.poll();

        // DISPLAYING THE CONTENTS OF THE PRIORITYQUEUE
        System.out.println("Displaying the contents of the PriorityQueue after poll() : "+pQueue);

        // REMOVING THE ELEMENT K USING remove()
        pQueue.remove(3);

        // DISPLAYING THE CONTENTS OF THE PRIORITYQUEUE
        System.out.println("Displaying the contents of the PriorityQueue after removing 3 : "+pQueue);

        // CHECKING IF THE QUEUE CONTAINS I OR NOT
        System.out.println("Does the PriorityQueue contain 4? - "+pQueue.contains(4));

    }
}
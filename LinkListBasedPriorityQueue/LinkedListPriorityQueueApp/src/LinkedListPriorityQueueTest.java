
/**
 * The <code>LinkedListPriorityQueueTest</code> is a Main class that tests the 
 * functionality of Linked List Based priority Queue Data Structure. 
 *  
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class LinkedListPriorityQueueTest {

    /**
     * Main Method - Entry Point of the Program. 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create PQ object
        PriorityQueue pq = new PriorityQueue(); 
        
        // Create some events
        Event e1 = new Event("Event1", 7);
        Event e2 = new Event("Event2", 3);
        Event e3 = new Event("Event3", 2);
        Event e4 = new Event("Event4", 9);
        Event e5 = new Event("Event5", 5);
        
        
        // Insert some elements
        pq.enqueue(e1);
        pq.print();
        System.out.println("Front of PQ: " + pq.peek());
        pq.enqueue(e2);
        pq.print();
        System.out.println("Front of PQ: " + pq.peek());
        pq.enqueue(e3);
        pq.print();
        System.out.println("Front of PQ: " + pq.peek());
        pq.enqueue(e4);
        pq.print();
        System.out.println("Front of PQ: " + pq.peek());
        pq.enqueue(e5);
        pq.print();
        System.out.println("Front of PQ: " + pq.peek());
        
        // Dequeue
        while(!pq.isEmpty()) {
            System.out.println("Front of PQ Removed: " + pq.dequeue()); // 9, 7, 5, 3, 2
            pq.print();
        }
    }

}


/**
 * The <code>ArrayPriorityQueueTest</code> is a Main class that tests the 
 * functionality of of the Array-Based Priority Queue Data Structure. 
 *  
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class ArrayPriorityQueueTest {

    /**
     * Main Method - Entry Point of the Program. 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Priority Queue
        PriorityQueue pq = new PriorityQueue(); 
        
        // Create some task objects
        Task t1 = new Task("Task7", 7);
        Task t2 = new Task("Task2", 2);
        Task t3 = new Task("Task9", 9);
        Task t4 = new Task("Task5", 5);
        Task t5 = new Task("Task13", 13);
        Task t6 = new Task("Task3", 3);
        
        // order or Priorities = 2, 3, 5, 7, 9, 13
        pq.enqueue(t1);
        pq.print();
        pq.enqueue(t2);
        pq.print();
        pq.enqueue(t3);
        pq.print();
        pq.enqueue(t4);
        pq.print();
        pq.enqueue(t5);
        pq.print();
        pq.enqueue(t6);
        pq.print();
        
        // removal
        while(!pq.isEmpty()) {
            System.out.printf("Task Removed: %s%n", pq.dequeue());
        }

    }

}

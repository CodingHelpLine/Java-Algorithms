import java.util.Random;

/**
 * Tester for the Queue Class
 * @author CodingHelpLine
 */
public class ArrayQueueAppTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // Create Queue Object
        Queue queue = new Queue(); 
        
        // Random Number generator
        Random random = new Random();
        
        // Insert few elements and view the state
        for(int i = 0; i < 5; i++) {
            // generate number
            int x = random.nextInt(100); 
            
            // display
            System.out.printf("Adding %d to the Queue%n", x); 
            
            // enqueue
            System.out.printf("Element %d added: %s%n", x, queue.enqueue(x));
            
            // Queue State
            System.out.printf("Size of Queue: %d%n", queue.size());
            
            // Print Queue
            queue.print();
            
        }
        
        // Insert few elements and view the state
        for(int i = 0; i < 5; i++) {
            
            int x = queue.peek();
            
            // display
            System.out.printf("Front Element %d of the Queue%n", x); 
            
            // dequeue
            System.out.printf("Element %d removed: %s%n", x, queue.dequeue());
            
            // Queue State
            System.out.printf("Size of Queue: %d%n", queue.size());
            
            // Print Queue
            queue.print();            
        }
    }
    
}

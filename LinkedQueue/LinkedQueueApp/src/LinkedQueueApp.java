
/**
 * Program to test the functionality of Linked List Based Queue Implementation. 
 * 
 * @author CodingHelpLine
 * WEB: http://codinghelpline.org
 */
public class LinkedQueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Object 
        Queue queue = new Queue(); 
        
        // Enqueue few numbers
        queue.enqueue(2);           // [2]
        queue.print();
        queue.enqueue(9);           // [2, 9]
        queue.print();
        queue.enqueue(18);           // [2, 9, 18]
        queue.print();
        queue.enqueue(3);           // [2, 9, 18, 3]
        queue.print();
        queue.enqueue(11);           // [2, 9, 18, 3, 11]
        queue.print();
        
        // Removal - dequeue
        while(!queue.isEmpty()) {
            System.out.printf("Front Element removed: %d%n", queue.dequeue());
            queue.print();
        }
        
    }
    
}

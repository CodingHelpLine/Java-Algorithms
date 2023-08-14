
/**
 * The <code>Queue</code> Class to implement a Linked List Base Queue. 
 * 
 * @author CodingHelpLine
 * WEB: http://codinghelpline.org
 */
public class Queue {
    
    // Here we implement the queue. 
    private Node head; 
    
    // count of elements
    private int count; 
    
    /**
     * Default constructor - to setup empty queue
     */
    public Queue() {
        head = null; 
        count = 0; 
    }
    
    
    /**
     * Enqueue at the end of the queue. 
     * 
     * O(N) for any insertion
     * O(1) if the queue is empty
     * 
     * @param data 
     */
    public void enqueue(int data) {
        
        Node node = new Node(data);
        
        // Insert at the end of the queue
        if(this.isEmpty()) {
            head = node; 
        } else {
            
            // Move to the end of the queue
            Node current = head; 
            
            while(current.getNext() != null) {
                current = current.getNext();
            }
            
            current.setNext(node);
        }
        
        count++;
    }
    
    /**
     * Remove from the front and return it. 
     * O(1)
     * Remove from front and return.
     * 
     * @return front element 
     */
    public int dequeue() {
        
        // check empty
        if(this.isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MAX_VALUE;
        }
        
        int data = head.getData();
        head = head.getNext();
        count--;
        return data; 
        
    }
    
    /**
     * Check front element of the queue. 
     * 
     * O(1)
     * 
     * @return front element 
     */
    public int peek() {
        
        if(this.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        
        return head.getData();
    }
    
    /**
     * Get the number of elements within the queue. 
     * 
     * O(1)
     * 
     * @return size of queue 
     */
    public int size() {
        return count; 
    }
    
    /**
     * Check the queue is empty or not. 
     * 
     * O(1)
     * 
     * @return indicate queue is empty 
     */
    public boolean isEmpty() {
        return head == null; 
    }
    
    /**
     * Display the Queue. 
     * 
     * O(1) Best Case
     * O(N) Average and Worst cases. 
     * 
     */
    public void print() {
       
        if(this.isEmpty()) {
            System.out.println("The Queue is Empty");
            return;
        }
        
        Node current = head; 
        
        System.out.printf("[%d", current.getData());
        
        current = current.getNext();
        
        while(current != null) {
            System.out.printf(", %d", current.getData());
            current = current.getNext();
        }
        
        System.out.println("]");
    }
}

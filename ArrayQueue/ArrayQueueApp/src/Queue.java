
/**
 * Implementation of Array Based Queue
 * 
 * @author CodingHelpLine
 */
public class Queue {
   
    // Maximum Size of array
    private final int MAX_SIZE = 100;
    
    // Array 
    private int queue []; 
    
    // Number of Elements
    private int count; 
    
    /**
     * Constructor to setup the Empty Queue and memory allocation. 
     */
    public Queue() {
        this.queue = new int[MAX_SIZE];
        this.count = 0; 
    }

    /**
     * Function to add new Element into the Queue and return true if successful. 
     * 
     * @param value to add to the queue
     * @return indicate success or failure of adding element
     */
    public boolean enqueue(int value) {
        
        // full or not
        if(this.isFull()) {
            return false; 
        }
        
        this.queue[count++] = value; 
        return true;
    }
    
    /**
     * Function to remove an element from the front of the Queue. 
     * 
     * @return indicate a successful or failed operation 
     */
    public boolean dequeue() {
        
        if(this.isEmpty()) {
            return false; 
        }
        
        // Shift all the element 1 position left
        for(int i=0; i<count-1; i++) {
            this.queue[i] = this.queue[i+1];
        }
        
        count--;
        
        return true;        
    }
    
    /**
     * Function to peek front value of this queue. 
     * 
     * @return front value.  
     */
    public int peek() {
        return queue[0];
    }
    
    /**
     * Size of the Queue - number of elements. 
     * 
     * @return number of elements 
     */
    public int size() {
        return count;
    }
    
    /**
     * Check whether this queue is full or not. 
     * 
     * @return indicate if the queue is full 
     */
    public boolean isFull() {
        return count == MAX_SIZE; 
    }
    
    /**
     * Check whether this queue is empty or not. 
     * 
     * @return indicate queue is empty.  
     */
    public boolean isEmpty() {
        return count == 0; 
    }
    
    /**
     * Print Function to print the Queue. 
     */
    public void print() {
        System.out.print("[");
        
        if(!this.isEmpty()) {
            System.out.printf("%d", queue[0]);
        }
        
        for(int i=1; i<count; i++) {
            System.out.printf(", %d", queue[i]);
        }
        
        
        System.out.println("]");
        
    }
}

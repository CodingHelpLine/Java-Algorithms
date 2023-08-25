
/**
 * The <code>PriorityQueue</code> class implements Array-based Priority Queue
 * Data Structure that will maintain the order of elements based on their 
 * priority. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class PriorityQueue {

    // array size
    private final int SIZE = 100; 
    
    // Array to store data
    private Task data []; 
    
    // count the elements
    private int count; 
    
    
    /**
     * Default Constructor to initialize the Objects of PriorityQueue class with
     * default values. 
     */
    public PriorityQueue() {
        this.data = new Task[SIZE]; 
        this.count = 0; 
    }
    
    /**
     * Function to add new element into the Priority Queue. 
     * 
     * // Stored into Array as Ascending order 
     * // list of tasks with order of priorities: 0, 1, 2, ,3 Ascending order
     * // Complexity:
     * O(N) or O(1) if array is empty
     * 
     * @param task 
     */
    public void enqueue(Task task) {
        
        // if queue is full
        if(this.isFull()) {
            grow();
        }
        
        // Insertion 
        // empty priority - store it on first index
        // otherwise find the correct location
        
        int idx = 0; 
        
        // shift elements have more priority towards 1 step right
        for(idx = count-1; idx >= 0 && data[idx].getPriority() > task.getPriority(); idx--) {
            data[idx+1] = data[idx];
        }
        
        // fill the hole to store new task
        data[idx+1] = task; 
        count++;
    }
    
    /**
     * Remove the front element and return it. 
     * 
     * NOTE: We are maintaining ascending order priority
     * So we Dequeue last element form the priority quey
     * 
     * O(1) Always
     * 
     * @return front element 
     */
    public Task dequeue() {
        
        // check if empty
        if(this.isEmpty()) {
            System.out.println("This Priority Queue is empty");
            return null; 
        }
        
        Task task = this.data[this.count-1]; 
        count--; 
        
        return task; 
    }
    
    /**
     * Function to check the number of elements in Priority Queue
     * 
     * @return number of elements.  
     */
    public int size() {
        return count; 
    }
    
    /**
     * Check if the Priority Queue is Empty. 
     * 
     * @return indicate queue is empty 
     */
    public boolean isEmpty() {
        return count == 0; 
    }
    
    /**
     * Check that queue is full. 
     * 
     * @return indicate queue is full.  
     */
    public boolean isFull() {
        return count == this.data.length;
    }
    
    /**
     * Increase the size of underlying array to accommodate more elements
     * whenever it is full. 
     */
    public void grow() {
        // new array with double capacity
        Task tmp [] = new Task[count * 2]; 
        
        // Copy elements
        for(int i=0; i<count; i++) {
            tmp[i] = data[i]; 
        }
        
        // assigne to data
        data = tmp; 
    }
    
    /**
     * Print the Priority Queue. 
     * 
     */
    public void print() {
     
        if(this.isEmpty()) {
            System.out.println("This Priority Queue is Empty!");
            return;
        }
        
        System.out.printf("[%s", this.data[0]);
        
        for(int i=1; i<count; i++) {
            System.out.printf(", %s", data[i].toString());
        }
        
        System.out.println("]");
    }
}

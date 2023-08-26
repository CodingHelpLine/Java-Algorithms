/**
 * The <code>PriorityQueue</code> class implement the Linked List Based Priority
 * Queue Data Structures that maintains the Order of Elements on the basis of 
 * their priority in Ascending order. 
 * 
 * To Handle lower priority or higher priority variation of Priority Queue
 * Data Structure we can modify the Dequeue methods to remove from front or 
 * back of the Queue. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class PriorityQueue {
    
    // Front of the Queue
    private Node front; 
    
    // element counter
    private int count; 

    /**
     * Default Constructor to initialize the Objects of PriorityQueue class with
     * default values. 
     */
    public PriorityQueue() {
        front = null; 
        count = 0; 
    }
    
    /**
     * Function to insert or enqueue new element of Event into the Priority Queue. 
     * 
     * 1. Maintain the Order of events according to their priority. 
     * 
     * // Strategies
     * 1. Ascending order -> we remove from the end
     * 2. Descending order - > we remove from the front. 
     * 
     * @param event to store
     * @return true if added. 
     */
    public boolean enqueue(Event event) {
        
        // Create node to insert
        Node node = new Node(event); 
        
        // Now if the priority queue is empty
        if(this.isEmpty() || front.getEvent().getPriority() > event.getPriority()) {
            
            // Handle both cases
            // 1 - priority queue is empty
            // 2 = new event priority is less than event stored at front of PQ
            node.setNext(front);  // in case of empty 
            front = node; 
            count++;
            return true; 
        }
        
        // find the location to insert new event
        Node current = front; 
        
        // navigate to find the approriate location
        while(current.getNext() != null && current.getNext().getEvent().getPriority() < event.getPriority()) {
            current = current.getNext(); 
        }
        
        // Situation
        // 1 We are the end of the Priority Queue
        if(current.getNext() == null) {
            current.setNext(node);
        } else {
            // update the next reference of new node to the 
            // next node of the current node. 
            node.setNext(current.getNext());
            
            // update next pointer or reference of current node to point to 
            // new node
            current.setNext(node);
        }
        
        count++; 
        return true; 
    }
    
    /**
     * Dequeue the Last Event from the Priority Queue -> Highest Priority
     * Event because we are maintaining the event in Ascending order of 
     * priority. 
     * 
     * @return highest priority event 
     */
    public Event dequeue() {
        
        // if the priority queue is empty
        if(this.isEmpty()) {
            System.out.println("This Priority Queue is empty");
            return null;
        }
        Event event = null; 
        
        if(front.getNext() == null) {
            event = front.getEvent();
            front = front.getNext();
            count--;
            return event;
        }
        
        // use two references
        Node current = front, pre = null; 
        
        // this way we reach the end of Priority Queue. O(N)
        while(current != null) {
            
            if(current.getNext() == null) {
                pre.setNext(current.getNext());
            }
            
            pre = current; 
            current = current.getNext();
        }
        
                
        event = pre.getEvent();
        pre.setNext(null);
        count--;
        
        return event; 
    }
    
    /**
     * To peek on the highest priority event. 
     * 
     * @return highest priority event 
     */
    public Event peek() {
        // use Single pointer
        Node current = front; 
        Event event = null; 
        
        // this way we reach the end of Priority Queue. O(N)
        while(current != null) {
            
            // improve performance
            if(current.getNext() == null) {
                event = current.getEvent();
            }
            
            current = current.getNext();
        }
        
        return event; 
    }
    
    /**
     * Size of the Priority Queue. 
     * 
     * @return number of elements.  
     */
    public int size() {
        return count; 
    }
    
    /**
     * Print the Priority Queue. 
     */
    public void print() {
        
        // if empty, notigy
        if(this.isEmpty()) {
            System.out.println("This Priority Queue is empty");
            return; 
        }
        
        Node current = front; 
        
        System.out.printf("[%s", current.getEvent().toString());
        
        current = current.getNext();
        
        // loop for rest of elements
        while(current != null) {
            System.out.printf(", %s", current.getEvent());
            current = current.getNext();
        }
        
        System.out.println("]");
    }
    
    /**
     * Function to check that this priority queue is empty. 
     * 
     * @return indicate queue is empty or not 
     */
    public boolean isEmpty() {
        return front == null; 
    }
}

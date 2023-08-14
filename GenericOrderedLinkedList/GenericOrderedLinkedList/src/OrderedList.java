
/**
 * The <code>OrderedList</code> class will implement the Sorted or ordered
 * singly linked list. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class OrderedList<T extends Comparable<T>> {
    
    // Head of the list
    private Node<T> head; 
    
    // count of elements
    private int count;
    
    /**
     * Constructor to create empty list
     */
    public OrderedList() {
        this.head = null;
        count = 0; 
    }
    
    /**
     * Function to add an element into the List at a correct position
     * to maintain the order of the list. 
     * 
     * @param data 
     */
    public void add(T data) {
        
        // First check if we need to insert before head
        // Case 1 and Case 2 
        if(this.isEmpty() || data.compareTo(head.getData()) < 0) {
            this.addFirst(data);
            return; 
        }
        
        // create new node
        Node<T> node = new Node<>(data); 
        
        // Navigate to the correct position
        Node<T> current = head; 
        
        // move to correct position
        while(current.getNext() != null && current.getNext().getData().compareTo(data) <= 0) {
            current = current.getNext();
        }
        
        // There are 2 Cases
        // Case 3: end of linked list reached
        if(current.getNext() == null) {
            current.setNext(node); 
        } else {
            // if somewhere between the list
            // put between two nodes
            node.setNext(current.getNext());
            
            // update current's next pointer
            current.setNext(node);
        }
        
        count++;
    }
    
    /**
     * There are two situation that we suppose to insert at the front of the 
     * Linked List. 
     * 
     * 1. If the List is empty. 
     * 2. If the head node element or data is larger than the new data
     * 
     * To maintain ascending order, insert at front of list. 
     * 
     * @param data 
     */
    public void addFirst(T data) {
        
        // Create new Node
        Node<T> node = new Node<>(data);
        
        // Case 1: If empty
        if(this.isEmpty()) {
            head = node; 
            
            // count++;  // Redundancy of code, must keep track of it
            
        } else {
            // Case 2: Insert before Head 
            node.setNext(head);
            head = node;
            // count++ //
        }
        
        count++;
    }
    
    /**
     * Remove element from the list. 
     * 
     * @param data 
     */
    public void remove(T data) {
        
        // Case 1 check empty list
        if(this.isEmpty()) {
            System.out.println("This list is empty");
            return; 
        }
        
        // Case 2: Remove from the front
        if(head.getData().equals(data)) {
            head = head.getNext();
            count--;
            return; 
        } 
        
        // declare supporting handles
        Node<T> current = head, pre = null; 
        
        while(current != null) {
            
            if(current.getData().equals(data)) {
                pre.setNext( current.getNext());
                count--;
                break;
            }
            
            // update references
            pre = current; 
            current = current.getNext();
        }
    }
    
    /**
     * Return the number of elements in the list. 
     * @return 
     */
    public int size() {
        return count;
    }
    
    /**
     * Function to check if the list is empty. 
     * 
     * @return indicate empty list 
     */
    public boolean isEmpty() {
        return head == null; 
    }
    
    /**
     * Print the list
     */
    public void print() {
        
        // check if empty
        if(this.isEmpty()) {
            System.out.println("The list is empty");
            return;
        }
        
        // [1, 2, 3, 4, 5] 
        
        Node<T> current = head; 
        
        System.out.printf("[%s", current.getData().toString());
        
        current = current.getNext();
        
        while(current != null) {
            System.out.printf(", %s", current.getData());
            current = current.getNext();
        }
        
        System.out.println("]");
    }
}

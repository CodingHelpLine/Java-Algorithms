
/**
 * Singly Ordered Linked List Class
 * 
 * @author Programmer
 */
public class OrderedList {
    
    // linked list head
    private Node head; 
    
    // number of nodes
    private int count;
    
    // constructor to initialize empty list
    public OrderedList() {
        this.head = null;  // ensure empty list at startup
        this.count = 0; 
    }
    
    // Add new value in correct order of the List. 
    // Function will maintain the Ascending order of the list. 
    public void add(int value) {
        
        // check two things
        // 1. Empty List - add to front
        // 2. if Value is smaller than head node value
        // store to front of Sorted List
        if(this.isEmpty() || value < this.head.getData()) {
            addFront(value);
            return; 
        }
        
        // Case 3: Need to insert somewhere between the existing nodes
        Node node = new Node(value); 
        
        //Find Correct Location
        Node current = head;    // start with head node
        
        // Conditional while to locate the location to insert new node
        while(current.getNext() != null && current.getNext().getData() <= value) {
            current = current.getNext();
        }
        
        // Two case
        // Case 4: if we reached Last Node
        if(current.getNext() == null) { // this is last node
            current.setNext(node);
        } else {
            // Put between two nodes
            node.setNext(current.getNext());  // new node next will be 
            // the next node of current node
            
            // now set next node of current node to new node
            current.setNext(node); 
        }
        
        count++;
    }
    
    // add at the front of the linked list. 
    private void addFront(int value) {
        
        // first create node
        Node node = new Node(value);
        
        // if list is empty
        if(this.isEmpty()) {
            head = node; 
        } else {
            node.setNext(head);
            head = node; 
        }
        
        count++;
    }
    
    // remove 
    public void remove(int value) {
        
        // if the list empty
        // case 1: 
        if(this.isEmpty()) {
            System.out.println("The List is Empty");
            return; 
        }
        
        // Case 2: We are remove head node
        if(head.getData() == value) {
            head = head.getNext();
            count--; 
        } else {
            
            // Find the node
            // Keep track of two nodes, previous and current
            Node current = head, pre = null; 
            
            // Iterate to find the node to remove
            while(current != null) {
                
                // if we reached desired node
                if(current.getData() == value) {
                    pre.setNext(current.getNext());
                    count--;
                    break; 
                }
                
                // Traversal
                pre = current; 
                current = current.getNext();
            }
        }
    }
    
    // print function
    public void print() {
        
        // start with head node
        Node current = head; 
        
        // Iterate till end of list
        while(current != null) {
            System.out.printf("%-10d", current.getData());
            current = current.getNext();
        }
        
        System.out.println("");
    }
    
    //check empty list
    public boolean isEmpty() {
        return head == null; 
    }
    
    // size
    public int size() {
        return count; 
    }
}


/**
 * Singly Linked List Class
 * 
 * @author Programmer
 */
public class List {
    
    // linked list head
    private Node head; 
    
    // number of nodes
    private int count;
    
    // constructor to initialize empty list
    public List() {
        this.head = null;
        count = 0; 
    }
    
    // add first 
    public void addFront(int value) {
        // new create node
        Node node = new Node(value); 
        
        // if it empty
        if(this.isEmpty()) {
            head = node; 
        } else {
            node.setNext(head);
            head = node; // point first node
        }
        
        count++; 
    }
    
    // add last 
    public void addBack(int value) {
        // create node
        Node node = new Node(value); 
        
        // if it is empty
        if(isEmpty()) {
            this.addFront(value);
            return;
        }
        
        Node current = head; 
        while(current.getNext() != null) {
            current = current.getNext();
        }
        
        current.setNext(node); // store at the end of list
        count++;
    }
    
    // remove 
    public void remove(int value) {
        
        // Case 1: If empty
        if(this.isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        
        // Case 2: head node
        if(head.getData() == value) {
            head = head.getNext();
            count--;
        } else {
            
            // between or end of node
            Node current = head, pre = null; 
            
            //iterate till the end of list
            while(current != null) {
                
                if(current.getData() == value) {
                    pre.setNext(current.getNext());
                    count--;
                    break;
                }
                
                // navigate
                pre = current; // keep track of previous node
                current = current.getNext(); // move to next node
            }
        }
    }
    
    // print function
    public void print() {
        
        // if empty
        if(this.isEmpty()) {
            System.out.println("The List is Empty");
            return;
        }
        
        Node current = head; 
        
        while(current != null) {
            System.out.printf("%-7d", current.getData());
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

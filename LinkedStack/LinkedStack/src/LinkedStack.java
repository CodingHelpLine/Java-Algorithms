
/**
 * Implementation of Linked Stack. 
 * 
 * @author Programmer
 */
public class LinkedStack {
    
    // top of stack
    private Node top;   // store linked nodes of data
    private int count; // count the elements in stack
    
    // Initialize Empty Stack with this Constructor
    public LinkedStack() {
        top = null; 
        count = 0; 
    }
    
    // Push an element on top of the Stack
    public void push(int val) {
        
        // we create new node
        Node node = new Node(val); 
        
        // if it is empty stack
        if(this.isEmpty()) {
            top = node; 
            count++;
        } else {
            
            // node->next = top 
            // top = node 
            
            node.setNext(top);
            top = node; 
            count++;
        }
    }
    
    // Pop an element from top of the Stack
    public int pop() {
        
        if(this.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        
        // assign next node to top
        int element = top.getData();
        top = top.getNext();
        count--;
        
        return element;
    }
    
    //  Peak Top element of the Stack. 
    public int peek() {
        if(!this.isEmpty()) {
            return top.getData();
        }
        
        throw new IllegalArgumentException("Stack is Empty");
    }
    
    // Check if Stack is empty
    public boolean isEmpty() {
        return top == null; 
    }
    
    // Get the Size of Stack
    public int size() {
        return count; 
    }
    
    // Print the Stack to the Standard output
    public void print() {
        
        if(this.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        
        // Print stack
        Node current = top; 
        
        while(current != null) {
            System.out.printf("%-10d", current.getData());
            current = current.getNext();
        }
        
        System.out.println("");
    }
}

/**
 * Implementation of Array Stack
 * 
 * @author Programmer
 */
public class ArrayStack {
   
    // Max Capacity
    private final int MAX_SIZE = 100; 
    
    // array storage
    private int stack [];
    
    // current index
    private int index; 
    
    // Initialize Empty Stack with this Constructor
    public ArrayStack() {
        // allocate memory
        this.stack = new int[MAX_SIZE]; 
        
        // index to zero
        index = 0; 
    }
    
    // Push an element on top of the Stack
    public void push(int val) {
        
        if(!isFull()) {
            stack[index++] = val; 
            
            return; // function exits
        }
        
        throw new IllegalArgumentException("ERROR: Stack is Full");
    }
    
    // Pop an element from top of the Stack
    public int pop() {
        
        // we only pop, if there is an element, 
        if(!this.isEmpty()) {
            int element = stack[index-1];
            
            // reduce index
            index--;
            
            return element;
        }
        
        throw new IllegalArgumentException("ERROR: Stack is empty");
        
    }
    
    //  Peak Top element of the Stack. 
    public int peek() 
        throws IllegalArgumentException{
        
        if(!isEmpty()) {
            return stack[index-1];
        }
        
        throw new IllegalArgumentException("ERROR: Stack is empty");
    }
    
    // Check if Stack is empty
    public boolean isEmpty() {
        return index == 0; 
    }
    
    // Check if Stack is Full
    public boolean isFull() {
        return index == MAX_SIZE; 
    }
    
    // Get the Size of Stack
    public int size() {
        return index; 
    }
    
    // Print the Stack to the Standard output
    public void print() {
        
        if(this.isEmpty()) {
            System.out.println("Stack is Empty");
        }
        
        for(int i=0; i<index; i++) {
            System.out.printf("%-10d", stack[i]);
        }
        
        System.out.println("");
    }
}

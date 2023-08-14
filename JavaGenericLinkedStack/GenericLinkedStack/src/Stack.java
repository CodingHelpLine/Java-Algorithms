
/**
 * Implementation of the Generic Linked Stack. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class Stack<T> {
    
    // top of the Stack
    private Node<T> top; 
    
    // count of elements
    private int count; 
    
    /**
     * Create Empty Stack. 
     */
    public Stack() {
        this.top = null; 
        this.count = 0; 
    }
    
    /**
     * Function to push an element on top of the Stack. 
     * 
     * @param data 
     */
    public void push(T data) {
        
        Node<T> node = new Node(data);
        
        // check if stack is empty
        if(this.isEmpty()) {
            top = node; 
        } else {
            node.setTop(top);
            top = node; 
        }
        count++;
    }
    
    /**
     * Remove the Top element and return it. 
     * 
     * @return top element 
     */
    public T pop() {
        
        // first check if empty
        if(this.isEmpty()) {
            System.out.println("The Stack is empty");
            return null;
        }
        
        T data = top.getData();
        top = top.getTop();
        count--;
        return data; 
    }
    
    /**
     * Peek the top element of the Stack
     * 
     * @return top element 
     */
    public T peek() {
        return top.getData();
    }
    
    /**
     * Check if the Stack is empty. 
     * 
     * @return indicate empty stack 
     */
    public boolean isEmpty() {
        return this.top == null; 
    }
    
    /**
     * The number of elements
     * 
     * @return number of elements 
     */
    public int size() {
        return count; 
    }
    
    /**
     * Print the Stack to console screen. 
     */
    public void print() {
        
        // if empty
        if(this.isEmpty()) {
            System.out.println("The Stack is empty");
            return;
        }
        
        // current node
        Node<T> current = top; 
        
        System.out.printf("[%s", current.getData().toString());
        
        current = current.getTop();
        
        while(current != null) {
            System.out.printf(", %s", current.getData().toString());
            current = current.getTop();
        }
        
        System.out.println("]");
    }
}

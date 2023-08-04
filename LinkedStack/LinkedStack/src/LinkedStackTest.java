import java.util.Random;

/**
 * Test the Stack Implementation. 
 * 
 * @author Programmer
 */
public class LinkedStackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Stack
        LinkedStack stack = new LinkedStack();
        
        // Random object
        Random random = new Random();
        
        // add new Elements
        System.out.println("Testing push Function:");
        for(int i=0; i<5; i++) {
            int x = random.nextInt(100); 
            System.out.printf("Pushing %d on top of Stack%n", x);
            stack.push(x);
            System.out.printf("Stack Size is: %d%n", stack.size());
            System.out.printf("Top element of Stack: %d%n", stack.peek());
            System.out.println("Current Stack is:");
            stack.print();
            System.out.println("\n");
        }
        
        // Pop Elements from stack
        System.out.println("Testing Pop Function: ");
        while(!stack.isEmpty()) {
            System.out.printf("Stack Size is: %d%n", stack.size());
            System.out.printf("Top element of Stack: %d%n", stack.peek());
            
            int x = stack.pop();
            System.out.printf("%d removed from top of Stack%n", x);
            System.out.println("Current Stack is:");
            stack.print();
            System.out.println("\n");
        }
    }
    
}

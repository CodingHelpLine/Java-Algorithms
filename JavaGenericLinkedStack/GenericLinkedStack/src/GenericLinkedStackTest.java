/**
 * Test Class to test the functionality of
 * Generic Linked Stack. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class GenericLinkedStackTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Integer stack
        Stack<Integer> intStack = new Stack<>();
        
        // Insert few elements
        intStack.push(2);           // [2]
        intStack.print();
        intStack.push(9);           // [9, 2]
        intStack.print();
        intStack.push(13);           // [13, 9, 2]
        intStack.print();
        intStack.push(7);           // [7, 13, 9, 2]
        intStack.print();
        intStack.push(19);           // [19, 7, 13, 9, 2]
        intStack.print();
        
        System.out.println("Test Pop()");
        while(!intStack.isEmpty()) {
            System.out.printf("Top Element Removed: %s%n", intStack.pop());
            intStack.print();
        }
        
    }
    
}

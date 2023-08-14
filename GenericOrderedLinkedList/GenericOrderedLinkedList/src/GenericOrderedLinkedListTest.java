
/**
 * Client application to test the Generic Ordered Linked List. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class GenericOrderedLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Integer List
        OrderedList<Integer> intList = new OrderedList<>();
        
        intList.add(5);     // [5]
        intList.print();
        intList.add(2);     // [2, 5]
        intList.print();
        intList.add(9);     // [2, 5, 9]
        intList.print();
        intList.add(11);    // [2, 5, 9, 11]
        intList.print();
        intList.add(4);     // [2, 4, 5, 9, 11
        intList.print();
        
        intList.remove(5);
        intList.print();        // [2, 4, 9, 11]
        intList.remove(11);
        intList.print();        // [2, 4, 9]
        intList.remove(4);
        intList.print();        // [2, 9]
        intList.remove(2);
        intList.print();        // [9]
        intList.remove(9);
        intList.print();        // []
        
        
        
        
        
        
    }
    
}

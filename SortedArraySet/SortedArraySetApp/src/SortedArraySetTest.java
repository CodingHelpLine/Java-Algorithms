
/**
 * The <code>SortedArraySetTest</code> class will test the functions of 
 * Array based Sorted Set Data Structure class. 
 * 
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class SortedArraySetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crate sets
        Set U = new Set();
        Set B = new Set();
        Set A = new Set(); 
        
        // pass some data into a
        U.add(5);
        U.add(7);
        U.add(13);
        U.add(8);
        U.add(2);
        U.add(1);
        
        // Some values in B
        B.add(5);
        B.add(8);
        B.add(2);
        
        // A set
        A.add(13);
        A.add(2);
        A.add(7);
        
        // First lets print them
        U.print();
        A.print();
        B.print();
        
    }
}

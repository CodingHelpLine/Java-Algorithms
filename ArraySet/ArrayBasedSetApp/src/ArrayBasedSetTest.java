
/**
 * The <code>ArrayBasedSetTest</code> class will test the functionality 
 * of the ArraySet Class. 
 *
 * @author CodingHelpLine
 * Website: http://codinghelpline.org 
 */
public class ArrayBasedSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArraySet A = new ArraySet();
        ArraySet B = new ArraySet();
        ArraySet C = new ArraySet();
        
        // [1, 3, 5, 7]
        // [2, 4, 6, 8]
        // [1, 2, 3, 5, 7, 8]
        
        // add elements
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(7);
        
        B.add(2);
        B.add(4);
        B.add(6);
        B.add(8);
        
        C.add(1);
        C.add(2);
        C.add(3);
        C.add(5);
        C.add(7);
        C.add(8);
        
        // Lets check Set functions
        ArraySet set = A.union(B);
        A.print();
        B.print();
        set.print();
        
        // intersection
        set = A.intersect(C);
        set.print();
        
        // difference
        set = B.difference(C);
        set.print();
        
        // complement
        set = C.complement(A); 
        set.print();
        
        // Disjoing
        System.out.println("Is A & B are disjoint? " + A.isDisjoint(B));
        System.out.println("Is A & C are disjoint? " + A.isDisjoint(C));
        System.out.println("Is B & C are disjoint? " + B.isDisjoint(C));
        
        // Proper subset
        System.out.println("Is A proper subset of C? " + C.isProperSubset(A));
        System.out.println("Is B proper subset of C? " + C.isProperSubset(B));
    }    
}

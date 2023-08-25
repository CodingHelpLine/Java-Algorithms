
/**
 * The <code>SortedArraySetTest</code> is a Main Class that tests the 
 * functionality of Array based Sorted Set Class. 
 *  
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class SortedArraySetTest {

    /**
     * Main Method - Entry Point of the Program. 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create Sets
        Set U = new Set();
        Set A = new Set();
        Set B = new Set(); 
        
        for(int i=1; i<=6; i++) {
            
            // {1, 2, 3, 4, 5, 6}
            U.add(i); 
            
            // {1, 3, 5}
            // only odd values to A
            if(i % 2 != 0) {
                A.add(i); 
            }
            
            // {2, 4, 6}
            if(i%2 == 0) {
                B.add(i); 
            }
        }
        

        System.out.println("Universal Set");
        U.print();
        System.out.println("Set A");
        A.print();
        System.out.println("Set B");
        B.print();
        
        // Check the union
        Set set = A.union(B); 
        System.out.println("Union of A & B:");
        set.print();
        
        // Intersection
        set = A.intersetion(B); 
        System.out.println("Intersection of A & B");
        set.print();
        
        set = U.intersetion(A);
        System.out.println("Intersection of U & A");
        set.print();
        
        set = A.difference(B);
        System.out.println("Difference of A & B => A-B");
        set.print();
        
        set = U.difference(A);
        System.out.println("Difference of U & A => U-A");
        set.print();
        
        // complement
        set = U.complement(A);
        System.out.println("Complement of A");
        set.print();
        
        set = U.complement(B);
        System.out.println("Complement of B");
        set.print();
     
        // Disjoint
        System.out.println("Is A & B are disjoint Sets: " + A.isDisjoint(B));
        System.out.println("Is U & A are disjoint Sets: " + U.isDisjoint(A));
        System.out.println("Is U & B are disjoint Sets: " + U.isDisjoint(B));
                
        // Proper Subset
        System.out.println("Is A is Proper Subset of B: " + A.isProperSubset(B));
        System.out.println("Is B is Proper Subset of A: " + B.isProperSubset(A));
        System.out.println("Is A is Proper Subset of U: " + U.isProperSubset(A));
        System.out.println("Is B is Proper Subset of U: " + U.isProperSubset(B));
        
    }

}

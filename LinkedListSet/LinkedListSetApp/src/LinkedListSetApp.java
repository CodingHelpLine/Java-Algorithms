
/**
 * Test the Linked List Based Set Data Structure. 
 * 
 * @author CodingHelpLine
 * Web: http://codinghelpline.org 
 */
public class LinkedListSetApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create sets
        Set U = new Set();
        Set A = new Set(); 
        Set B = new Set(); 
        
        // U is universal set [1, 2, 3, 4, 5, 6}
        U.add(1);
        U.add(2);
        U.add(3);
        U.add(4);
        U.add(5);
        U.add(6);
        
        // A { 1, 2, 6}
        A.add(1);
        A.add(2);
        A.add(6);
        
        // B { 2, 3, 4, 5, 6}
        B.add(2);
        B.add(3);
        B.add(4);
        B.add(5);
        B.add(6);
        
        // Lets print them
        System.out.println("Set U: ");
        U.print();
        System.out.println("Set A: ");
        A.print();
        System.out.println("Set B: ");
        B.print();
        
        
        // Union:
        Set r = A.union(B);
        System.out.println("Union of A & B");
        r.print();
        
        // Intersection
        r = A.intersection(B); 
        System.out.println("Intersection of A & B");
        r.print();
        
        // Difference
        r = A.difference(B); 
        System.out.println("Difference of A and B");
        r.print();
        
        // Complement of A
        r = U.complement(A); 
        System.out.println("Complement of A");
        r.print();
        
        // disjoint
        System.out.println("Is A and B are disjoint sets? " + A.isDisjoint(B));
        
        // Proper Subset
        System.out.println("A is Proper Subset of U - " + U.isProperSubset(B));
        System.out.println("A is Proper Subset of B - " + B.isProperSubset(A));
        
        
        
    }
    
}

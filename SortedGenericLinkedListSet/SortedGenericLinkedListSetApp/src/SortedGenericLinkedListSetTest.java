
/**
 * The <code>SortedGenericLinkedListSetTest</code> is a Main class that 
 * tests the functionality of Sorted Set class implemented using Java
 * Generics. 
 *  
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class SortedGenericLinkedListSetTest {

    /**
     * Main Method - Entry Point of the Program. 
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SortedSet<String> U = new SortedSet<String>();
        SortedSet<String> A = new SortedSet<String>();
        SortedSet<String> B = new SortedSet<String>();
        SortedSet<String> D = new SortedSet<>();
        
        SortedSet<String> E = new SortedSet<>();
        
        D.add("Tina");
        D.add("Mira"); 
        
        // insert elements
        U.add("John");
        U.add("Jack");
        U.add("Peter");
        U.add("Smith");
        U.add("Marry");
        
        // Set A
        A.add("John");
        A.add("Jack");
        A.add("Peter");
        
        E.add("John");
        E.add("Jack");
        E.add("Peter");
        
        // Set B
        B.add("John");
        B.add("Marry");
        B.add("Peter");
        B.add("Smith");
        B.add("Shawn");
        
        // Print these 
        System.out.println("Unversal Set:");
        U.print();
        System.out.println("A Set:");
        A.print();
        System.out.println("B Set:");
        B.print();
        
        // Lets Test Set functions
        SortedSet<String> set = A.union(B);
        System.out.println("Union of A & B:");
        set.print();
        
        // Intersection
        set = A.intersection(B);
        System.out.println("Intersection of A & B:");
        set.print();
        
        // Difference of sets
        set = A.difference(B);
        System.out.println("Difference of A & B:");
        set.print();
        
        set = U.difference(A);
        System.out.println("Difference of U & A:");
        set.print();
        
        // complement of sets
        set = U.complement(A);
        System.out.println("Complement A or A`:");
        set.print();
        set = U.complement(B);
        System.out.println("Complement B or B`:");
        set.print();
        
        // Disjoint Sets
        System.out.printf("Is A & B disjoint? %s%n", A.isDisjoint(B));
        System.out.printf("Is A & D disjoint? %s%n", A.isDisjoint(D));
        System.out.printf("Is B & D disjoint? %s%n", B.isDisjoint(D));
        
        // Proper Set
        System.out.printf("Is A proper Subset of U? %s%n", U.isProperSubset(A));
        System.out.printf("Is B proper Subset of U? %s%n", U.isProperSubset(B));
        
        A.print();
        E.print();
        System.out.printf("Is A proper Subset of E? %s%n", A.isProperSubset(E));
        System.out.printf("Is E proper Subset of A? %s%n", E.isProperSubset(A));
    }

}

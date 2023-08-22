
/**
 * The <code>Set</code> Will implement the Sorted Array Based Set
 * Data Structure. Maintains the elements in Ascending order. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class Set {

    // capacity
    private final int INIT_CAPACITY = 100; 
    
    // We need array to store data
    private int array []; 
    
    // Index to keep track of elements
    private int index; 
    
    /**
     * Constructor to initialize set with default can zero element. 
     */
    public Set() {        
        this.array = new int[INIT_CAPACITY]; 
        this.index = 0;         
    }
    
    //******************** Basic functions ***********************//
    
    /**
     * Function to add a new element into the Sorted Set data structure
     * 
     * 1. Unique elements
     * 2. Sorted arrangement Ascending Order
     * 
     * @param value
     * @return true if added, false otherwise
     */
    public boolean add(int value) {
        
        // To add at a correct position and maintain
        // Ascending order this is how we achieve it
        
        // find the location
        int pos; 
        
        // shift elements towards right, and make room for the new element
        // at a correct location
        for(pos = index-1; (pos >= 0 && (array[pos] > value)); pos--) {
            array[pos+1] = array[pos];
        }
        
        array[pos + 1] = value; 
        index++;
        
        // Efficient: because it is linear best case O(1), Average and Worst 
        // cases are O(N)
        
        return true; 
    }
    
    /**
     * Remove an existing element from the Sorted Set. 
     * 
     * @param value to remove
     * @return true if removed, otherwise false. 
     */
    public boolean remove(int value) {
        
        int idx = find(value); // get the index of element
        
        // if not exist
        if(idx == -1) {
            return false; 
        }
        
        // shift elements 1 position left
        for(int i=idx; i<index-1; i++) {
            array[i] = array[i+1];
        }
        
        index--;
        
        return true; // element removed
    }
    
    /**
     * Find the index of an element if it exists otherwise return -1. 
     * 
     * @param value to find
     * @return -1 if not found, otherwise index of element
     */
    public int find(int value) {
        
        for(int i=0; i<index; i++) {
            if(array[i] == value) {
                return i; 
            }
        }
        
        return -1; 
    }
    
    /**
     * Function to check that Set is empty. 
     * 
     * @return indicate if it is empty or not 
     */
    public boolean isEmpty() {
        return index == 0; 
    }
    
    /**
     * Print the Sorted Set. 
     */
    public void print() {
        
        // if empty
        if(this.isEmpty()) {
            System.out.println("This set is empty");
            return; 
        }
        
        // print first element
        System.out.printf("[%d", array[0]);
        
        // print rest of the elements
        for(int i=1; i<index; i++) {
            System.out.printf(", %d", array[i]);
        }
        
        System.out.println("]");
    }
    
    //------------------- Set Functions -------------------------------//
    
    /**
     * Function to create a Union of two sets. 
     * 
     * A = {1, 3, 5}
     * B = {2, 4, 6}
     * Union: { 1, 2, 3, 4, 5, 6}  // sorted order
     * 
     * @param other set
     * @return union of two sets
     */
    public Set union(Set other) {
        
        // Create new set
        Set set = new Set();
        
        // insert first set elements
        for(int i=0; i<index; i++) {
            set.add(array[i]);
        }
        
        // insert the second set
        for(int i=0; i<other.index; i++) {
            set.add(other.array[i]);
        }
        
        return set; 
    }
    
    /**
     * How it works? 
     * 
     * A = {1, 2, 3, 5}
     * B = {2, 4, 5, 7}
     * 
     * Intersetion will be {2, 5}
     * 
     * All in Ascending order
     * 
     * @param other set
     * @return intersection of two sets
     */
    public Set intersection(Set other) {
        
        // Create new set
        Set set = new Set(); 
        
        for(int i=0; i<index; i++) {
            int idx = other.find(array[i]);
            
            // -1 indicates doesn't exist
            // any non-negative index means we have that element
            // in the other set also. common element
            if(idx != -1) {
                set.add(array[i]);
            }
        }
        
        return set; // intersection
    }
    
    /**
     * Function to create the Difference of Two Sets. 
     * 
     * A = {1, 2, 3, 5}
     * B = {2, 3, 7, 9}
     * A- B = {1, 5}
     * 
     * Maintain ascending order
     * 
     * @param other set
     * @return difference of two sets
     */
    public Set difference(Set other) {
        
        // create new set
        Set set = new Set();
        
        // loop for each element
        for(int i=0; i<index; i++) {
            int idx = other.find(array[i]); 
            
            if(idx == -1) { // indicates doesn't exist in other set
                set.add(array[i]); 
            }
        }
        
        return set; // A-B
    }
    
    /**
     * Function will generate Complement of A = A`
     * 
     * Set U = {1, 2, 3, 4, 5, 6}
     * Set A = {2, 4, 6}
     * 
     * A` = {1, 3, 5}
     * 
     * @param other
     * @return complement of a set
     */
    public Set complement(Set other) {
        
        // new set
        Set set = new Set(); 
        
        // loop the universal set
        for(int i=0; i<index; i++) {
            int idx = other.find(array[i]); 
            
            if(idx == -1) {
                set.add(array[i]);
            }
        }
        
        // return complement set
        return set; 
    }
    
    /**
     * Function to check if two sets are disjoint
     * 
     * A = {1, 2, 3}
     * B = {4, 5, 6} 
     * A and B are Disjoint
     * 
     * C = {2, 5, 7}
     * 
     * A & C are not disjoint 
     * B & C are not disjoint 
     * 
     * @param other set
     * @return true if disjoint, otherwise false. 
     */
    public boolean isDisjoint(Set other) {
        
        for(int i=0; i<index; i++) {
            int idx = other.find(array[i]);
            
            if(idx != -1) {
                return false; 
            }
        }
        
        return true; // sets are disjoint 
    }
    
    /**
     * Function to check if a given set is a subset of other set. 
     * 
     * A = {1, 2, 3, 4, 5, 6}
     * B = {1, 2, 5}
     * 
     * B is a Proper Subset of A
     * 
     * C = {1, 2, 9}
     * 
     * C is not a subset of A because 9 is not in A
     * 
     * @param other set
     * @return true if other set is a subset of current set. 
     */
    public boolean isProperSubset(Set other) {
        
        // loop the other set for every element
        for(int i=0; i<other.index; i++) {
            int idx = find(other.array[i]); 
            
            // doesn't exist
            if(idx == -1) {
                return false; 
            }
        }
        
        // reach here - other set is a proper subset. 
        return true; 
    }
}

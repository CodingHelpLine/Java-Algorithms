
/**
 * The <code>ArraySet</code> class will implement the Array Based Set 
 * Data Structure including Set Operations. 
 *
 * @author CodingHelpLine
 * Website: http://codinghelpline.org 
 */
public class ArraySet {

    // Now Capacity for the array
    private final int CAPACITY = 100; 
    
    // Array to hold values
    private int data []; 
    
    // Index 
    private int index; 
    
    /**
     * Default constructor to setup array memory. 
     */
    public ArraySet() {
        this.data = new int[CAPACITY]; 
        this.index = 0; 
    }
    
    
    ////////////////////////////////////////////////////////////////////////
    //              SET THEORY FUNCTIONS                                  //
    ////////////////////////////////////////////////////////////////////////
    
    
    /**
     * This function create a new set that is the union of two sets. 
     * 
     * @param other set
     * @return union
     */
    public ArraySet union(ArraySet other) {
        
        ArraySet union = new ArraySet(); 
        
        // insert all the elements from current set
        // insert all the elements from other set
        // The set maintains uniqueness due to this condition in Add function
        for(int i=0; i<index; i++) {
            union.add(data[i]);
        }
        
        for(int i=0; i<other.index; i++) {
            union.add(other.data[i]);
        }
        
        return union;
    }
    
    /**
     * Create a new Set that has elements common in both sets. 
     * 
     * @param other set
     * @return intersection of two sets
     */
    public ArraySet intersect(ArraySet other) {
        ArraySet intersection = new ArraySet(); 
        
        // insert only common elements from both sets
        // The set maintains uniqueness due to this condition in Add function
        for(int i=0; i<index; i++) {
            
            if(other.find(data[i])) {            
                intersection.add(data[i]);
            }
        }
        
        return intersection;
    }
    
    /**
     * Function to create new Set that is the different of elements
     * from A to B
     * 
     * All the elements from A that are not in B
     * 
     * @param other
     * @return 
     */
    public ArraySet difference(ArraySet other) {
        ArraySet difference = new ArraySet(); 
        
        // insert elements from A that are not in B
        // The set maintains uniqueness due to this condition in Add function
        for(int i=0; i<index; i++) {
            // D = A - B
            if(!other.find(data[i])) {            
                difference.add(data[i]);
            }
        }
        
        return difference;
    }
    
    /**
     * Function to create a new Set that is the Complement of A
     * 
     * U = {1, 2, 3, 4, 5, 6}
     * other = {2, 3, 4, 5}
     * 
     * Complement: {1, 6}
     * 
     * @param other is the set whose complement will be created
     * @return the complement
     */
    public ArraySet complement(ArraySet other) {
        ArraySet complementSet = new ArraySet(); 
        
        // insert elements from U that are not in A
        // The set maintains uniqueness due to this condition in Add function
        for(int i=0; i<index; i++) {
            // A` = {} 
            if(!other.find(data[i])) {            
                complementSet.add(data[i]);
            }
        }
        
        return complementSet;
    }
    
    /**
     * check whether two sets are disjoint. 
     * 
     * A disjoint set are two sets that have no common element
     * 
     * A = {1, 3, 5}
     * B = {2, 4, 6}
     * 
     * Disjoint sets
     * 
     * @param other set
     * @return indicate disjoint or not
     */
    public boolean isDisjoint(ArraySet other) {
        
        for(int i = 0; i < index; i++) {
            if(other.find(data[i])) {
                return false; 
            }
        }
        
        return true; 
        
    }

    /**
     * Check one set is the subset of other set. 
     * 
     * @param other set
     * @return indicate if it is proper subset 
     */
    public boolean isProperSubset(ArraySet other) {
        
        for(int i=0; i<other.index; i++) {
            if(!find(other.data[i])) {
                return false; 
            }
        }
        
        return true; // means other is subset of current set. 
    }
    
    
    /**
     * function to add an element to the set. 
     * 
     * // condition: 
     * 1. capacity
     * 2. uniqueness 
     * 
     * @param value
     * @return 
     */
    public boolean add(int value) {
        
        // case - set is full
        if(this.isFull()) {
            // grow the array
            this.grow();
        }
        
        // check if the value already exist within the Set
        // to maintain uniqueness of its elements
        if(find(value)) {
            // System.out.println("The Value already exist");
            return false; 
        }
        // assign or store the value
        this.data[index++] = value; 
        return true; 
    }
    
    /**
     * remove an element from the Set. 
     * 
     * @param value to remove
     * @return true if removed, false otherwise
     */
    public boolean remove(int value) {
        
        // find index
        int index = -1; 
        
        for(int i=0; i<index; i++) {
            if(data[i] == value) {
                index = i; 
                break; 
            }
        }
        
        // element doesn't exist
        if(index == -1) {
            return false; 
        }
        
        // shift the elements to fill the gap
        for(int i=index; i < data.length-1; i++) {
            data[i] = data[i+1]; // overwrite previous element
        }
        
        // update index
        index--;
        
        return true; 
    }

    /**
     * Get the number of elements. 
     * 
     * @return number of elements.  
     */
    public int size() {
        return index; 
    }
    
    /**
     * Print the Set
     */
    public void print() {
        
        if(this.isEmpty()) {
            System.out.println("The Set is empty");
            return; 
        }
        
        System.out.printf("[%d", data[0]);
        
        for(int i=1; i<index; i++) {
            System.out.printf(", %d", data[i]);
        }
        
        System.out.println("]");
    }
    
    /**
     * Function to check whether a value exists
     * 
     * @param value to check
     * @return indicate exist or not
     */
    public boolean find(int value) {
        
        for(int i=0; i<index; i++) {
            if(data[i] == value) {
                return true; 
            }
        }
        
        return false; 
    }
    
    /**
     * Check if the set is full. 
     * 
     * @return indicate set is full 
     */
    public boolean isFull() {
        return index == data.length; 
    }
    
    /**
     * if set is empty. 
     * 
     * @return indicate set is empty 
     */
    public boolean isEmpty() {
        return index == 0; 
    }
    
    /**
     * grow the array size and keep the existing elements
     */
    private void grow() {
        // new array
        int copy [] = new int[data.length]; 
        
        // copy the elements
        for(int i=0; i<index; i++) {
            copy[i] = data[i];
        }
        
        // reassign data
        data = new int[index * 2]; // double the size
        
        // now copy back
        for(int i=0; i<index; i++) {
            data[i] = copy[i];
        }
    }
    
}

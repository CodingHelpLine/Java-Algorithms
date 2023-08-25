
/**
 * The <code>Set</code> class will implement a Sorted Set based on a Dynamic
 * Array. The size of array grows if required to twice the capacity.  
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class Set {

    // We set an initial Capacity
    private final int CAPACITY = 100; 
    
    // need array 
    private int data []; 
    
    // Keep track of number of elements
    private int count; 
    
    
    /**
     * Default Constructor to initialize the Objects of Set class with
     * default values. 
     */
    public Set() {
        this.data = new int [CAPACITY]; 
        this.count = 0; 
    }
    
    // ------------ Basic Data Structure functions -----------------------//
    
    /**
     * Add a new element into the Set and maintain the Order of Elements. 
     * 
     * Take care of following things
     * 1. No Duplicate - unique elements
     * 2. Maintain the order
     * 
     * @param value to add
     * @return true if added, otherwise return false. 
     */
    public boolean add(int value) {
        
        // first array capacity
        if(this.count == this.data.length) {
            // grow the array
            grow();
        }
        
        // need to know if value already exist
        int idx = find(value); 
        
        // Value is not in the Sorted Set
        if(idx == -1) {
            
            // Insert 8
            // 1 3, 7, 10, 11 -
            for(idx = count-1; idx >= 0 && data[idx] > value; idx--) {
                data[idx+1] = data[idx]; 
            }
            
            data[idx+1] = value; 
            count++;
            return true; 
        }
        
        return false; 
        
    }
    
    /**
     * remove an an element form the sorted set. 
     * 
     * @param value to remove
     * @return return true if removed, otherwise false
     */
    public boolean remove(int value) {
        
        // find the index
        int idx = find(value); 
        
        // if element exist
        if(idx >= 0) {
            
            // shift left all elements to remove value
            for(int i = idx; i<count-1; i++) {
                data[i] = data[i+1];
            }
            
            count--; 
            return true; 
        }
        
        return false; 
    }
    
    
    /**
     * Find the index of an element within the Sorted Set
     * 
     * @param value to find
     * @return index of element or -1 if not found
     */
    public int find(int value) {
        
        for(int i=0; i<count; i++) {
            if(data[i] == value) {
                return i; 
            }
        }
        
        // indicate not found
        return -1; 
    }
    
    /**
     * Check that if the Sorted Set is Empty. 
     * 
     * @return true if empty, false otherwise.  
     */
    public boolean isEmpty() {
        return count == 0; 
    }
    
    /**
     * Print the Sorted Set
     */
    public void print() {
        
        if(this.isEmpty()) {
            System.out.println("Sorted Set is empty");
            return;
        }
        
        System.out.printf("[%d", data[0]);
        
        for(int i=1; i<count; i++) {
            System.out.printf(", %d", data[i]);
        }
        
        System.out.println("]");
        
    }
    
    /**
     * Function to increase the underlying array size. 
     */
    private void grow() {
        
        // new array to hold current data
        int temp [] = new int[count * 2]; 
        
        for(int i=0; i<count; i++) {
            temp[i] = data[i]; 
        }
        
        // this step will cost O(N) time
        // we should copy temp array into data after resizing
        
        // assign it
        data = temp; 
    }
    
    // ------------- Set Functions ---------------------------------------//
    
    /**
     * Union Function: Take all the elements from Set A and B and add them
     * to the new Set that is the Union of two Sets. 
     * 
     * Possibility: common elements - No duplicate is managed by add function
     * 
     * A = {1, 2, 5}
     * B = {2, 4, 7}
     * 
     * AUB = {1, 2, 4, 5, 7} -- this is Sorted Set maintain order
     * 
     * @param other set
     * @return union of two sets
     */
    public Set union(Set other) {
        
        // Create new set
        Set set = new Set(); 
        
        // add all elements from current set
        for(int i=0; i<count; i++) {
            set.add(data[i]);
        }
        
        // add all the elements from other set. 
        for(int i=0; i<other.count; i++) {
            set.add(other.data[i]);
        }
        
        return set;
    }
    
    /**
     * Function to create an Intersection of Two Sets. 
     * 
     * Example
     * Set A = {1, 2, 3, 5}
     * Set B = {2, 4, 5, 7}
     * 
     * Intersection = {2, 5}
     * 
     * @param other set 
     * @return intersection of two sets. 
     */
    public Set intersetion(Set other) {
        
        // Create new set
        Set set = new Set(); 
        
        for(int i=0; i<count; i++) {
            
            int x = data[i]; 
            
            // find common elements
            if(other.find(x) != -1) {
                set.add(x);
            }
        }
        
        return set; 
    }
    
    /**
     * Difference of two sets. 
     * 
     * A = {1, 2, 3, 5}
     * B = {2, 5, 7, 9}
     * 
     * A - B = {1, 3} 
     * B - A = {7, 9}
     * 
     * @param other set
     * @return difference of two sets
     */
    public Set difference(Set other) {
        // Create new set
        Set set = new Set(); 
        
        // loop for current set
        for(int i=0; i<count; i++) {
            
            // if element doesn't exist in other set
            if(other.find(data[i]) == -1) {
                set.add(data[i]);
            }
        }
        
        return set; 
    }

    /**
     * Complement of A Set. 
     * 
     * U = {1, 2, 3, 4, 5, 6}
     * Set A = {1, 3, 5}
     * Set B = {2, 4, 6}
     * 
     * A` = {2, 4, 6} 
     * B` = {1, 3, 5}
     * 
     * @param other set 
     * @return complement of the set
     */
    public Set complement(Set other) {
        // create set
        Set set = new Set(); 
        
        // loop the current set that is Universal Set
        for(int i=0; i<count; i++) {
            if(other.find(data[i]) == -1) {
                set.add(data[i]);
            }
        }
        
        return set; 
    }
    
    /**
     * Function to determine two sets are disjoint 
     * 
     * A = {1, 3, 5}
     * B = {2, 4, 6}
     * 
     * They are disjoint because no common element
     * 
     * @param other 
     * @return 
     */
    public boolean isDisjoint(Set other) {
        
        /*
        // First method
        Set set = this.intersetion(other); 
        
        // empty means disjoint, otherwise not disjoint. 
        return set.isEmpty(); 
        */
        
        // Method 2
        Set set = new Set(); 
        
        for(int i=0; i<count; i++) {
            
            if(other.find(data[i]) != -1) {
                return false; 
            }
        }
        
        return true; 
    }
    
    /**
     * check to see if one set is the proper subset of current set. 
     * 
     * // example 
     * A = {1, 2, 3, 4, 5, 6}
     * B = {1, 3, 5}
     * C = {1, 2, 3}
     * 
     * B is proper subset of A
     * C is proper subset of A
     * 
     * B is not proper subset of C
     * C is not proper subset of B
     * 
     * @param other set
     * @return true if other set is proper subset of current set. 
     */
    public boolean isProperSubset(Set other) {
        
        for(int i=0; i<other.count; i++) {
            if(find(other.data[i]) == -1) {
                return false; 
            }
        }
        
        return true; // other set is proper subset of Current set.         
    }
}

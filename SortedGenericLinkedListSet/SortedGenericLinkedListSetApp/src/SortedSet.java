
/**
 * The <code>SortedSet</code> class that will implement Generic Sorted Set
 * Data Structure. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class SortedSet<T extends Comparable<T>> {
    
    // front of set
    private Node<T> head; 
    
    // Count of elements
    private int count; 
    
    /**
     * Default Constructor to initialize the Objects of SortedSet class with
     * default values. 
     */
    public SortedSet() {
        this.head = null; 
        this.count = 0; 
    }
    
    //------------------------ Basic Data Structure Functions ----------------//
    
    /**
     * This function will add new element into the Sorted Set. 
     * 
     * // Two conditions
     * 1. Order of elements - Ascending
     * 2. No Duplication - Uniqueness is a feature of set structure. 
     * 
     * @param data to add
     * @return true if successful otherwise false. 
     */
    public boolean add(T data) {
        
        // Add Function 
        // 2 Things:
        // add to the front
        // or add to somewhere between the set or at the end of the set
        
        // 3: Uniqueness of the elements
        if(find(data)) {
            return false; // no duplicate allowed
        }
        
        
        if(this.isEmpty() || data.compareTo(head.getData()) <= 0) {
            // add to the front
            return this.addFront(data);
        } else {
            
            // Create new node
            Node<T> node = new Node<>(data); 
            
            // navigate the set to locate position of new node
            Node<T> current = head; 
            
            // move to find the correct location of new node. 
            while(current.getNext() != null && current.getNext().getData().compareTo(data) <= 0) {
                current = current.getNext();
            }
            
            // two conditions
            // 1. End of set
            if(current.getNext() == null) {
                current.setNext(node);
            } else {
                // update next reference of new node
                node.setNext(current.getNext());
                
                // update next reference of current node
                current.setNext(node);
            }
            
            count++;
        }
        
        return true; 
    }
    
    /**
     * Function to add new element to the front of the Sorted Set. 
     * 
     * in both cases: empty set or value is smaller than head node. 
     * 
     * @param data to add to front
     * @return true if successful, other false
     */
    private boolean addFront(T data) {
        
        // Create new node
        Node<T> node = new Node<>(data); 
        
        // if empty, assigned to head
        if(this.isEmpty()) {
            head = node; 
        } else {
            
            // update next pointer
            node.setNext(head);
            
            // update the head
            head = node; 
        }
        
        count++;
        return true; 
    }
    
    /**
     * Function to remove an element from the Set if it exists otherwise
     * return false. 
     * 
     * @param data to remove
     * @return true if removed otherwise false. 
     */
    public boolean remove(T data) {
        
        // if set is empty, we return false
        if(this.isEmpty()) {
            return false; // do nothing
        }
        
        // if it is head node, 
        if(this.head.getData().equals(data)) {
            head = head.getNext();
            count--;
            return true; 
        } else {
            
            // remove the node some somewhere between the sorted set. 
            Node<T> current = head, pre = null; 
            
            // traverse the set
            while(current != null) {
                if(current.getData().equals(data)) {
                    // update previuse node of current node next pointer
                    pre.setNext(current.getNext());
                    count--;
                    return true; 
                }
                
                // keep track of previous and next nodes
                pre = current; 
                current = current.getNext();
            }
        }
        
        return false; // to indicate failure 
    }
    
    /**
     * Function to check an element exist in the Sorted Set. 
     * 
     * @param data to check
     * @return true if exist otherwise false. 
     */
    public boolean find(T data) {
        
        // Check if Set is empty
        if(this.isEmpty()) {
            return false; 
        }
        
        // Navigate within the Set to find existence of element
        Node<T> current = head; 
        
        while(current != null) {
            if(current.getData().equals(data)) {
                return true; 
            }
            current = current.getNext();
        }
        
        return false; // does not exist
    }
    
    /**
     * Get the number of elements in the Set 
     * 
     * @return number of elements
     */
    public int size() {
        return this.count; 
    }
    
    /**
     * Function to check that Sorted Set is Empty. 
     * 
     * @return indicate emptiness of set.  
     */
    public boolean isEmpty() {
        return count == 0;
    }
    
    /**
     * Print the Sorted Set. 
     */
    public void print() {
        
        // Check if empty
        if(this.isEmpty()) {
            System.out.println("This Sorted Set is Empty");
            return;
        }
        
        // Iterate the Set
        Node<T> current = head; 
        
        // print it
        System.out.printf("[%s", current.getData());
        
        // move to next node
        current = current.getNext();
        
        // Loop and traverse the Set
        while(current != null) {
            System.out.printf(", %s", current.getData());
            current = current.getNext(); // don't forget to move to next node
        }
        
        System.out.println("]");
    }
    
    // ----------------------- Set Speical Functions ------------------------//
    
    /**
     * Function to create new Set that is the Union of two sets. 
     * 
     * A = {"Jack", "John", "Marry", "Peter"}
     * B = {"John", "Smith"}
     * 
     * A U B = {"Jack", "John", "Marry", "Peter", "Smith"} 
     * 
     * @param other set for union
     * @return union of two sets
     */
    public SortedSet<T> union(SortedSet<T> other) {
        // create new set
        SortedSet<T> set = new SortedSet<>();
        
        // we loop current set, if any common element return false
        Node<T> current = head; 
        
        while(current != null) {
            set.add(current.getData()); 
            current = current.getNext();
        }
        
        // Loop for the other set, add all the elements
        current = other.head; 
        while(current != null) {
            set.add(current.getData()); 
            current = current.getNext();
        }
        
        return set;
    }
    
    /**
     * Function to create a new Set that is the Intersection of two sets. 
     * 
     * A = {"Jack", "John", "Marry", "Peter"}
     * B = {"John", "Marry", "Smith"}
     * 
     * Intersection = {"John", "Marry"} 
     *
     * 
     * @param other set for intersection
     * @return Intersection of Two Sets
     */
    public SortedSet<T> intersection(SortedSet<T> other) {
        
        // create new set
        SortedSet<T> set = new SortedSet<>();
        
        // we loop current set, if any common element return false
        Node<T> current = head; 
        
        while(current != null) {
            if(other.find(current.getData())) {
                set.add(current.getData()); 
            }
            current = current.getNext();
        }
        
        return set;
        
    }
    
    /**
     * Function to create new Set that is the Difference of Two Sets lets say 
     * A- B
     * 
     * A = {"Jack", "John", "Marry", "Peter"}
     * B = {"John", "Marry", "Smith"}
     * 
     * A - B = {"Jack", "Peter"} 
     * B - A = {"Smith"}
     * 
     * @param other
     * @return 
     */
    public SortedSet<T> difference(SortedSet<T> other) {
        
        // create new set
        SortedSet<T> set = new SortedSet<>();
        
        // we loop current set, if any common element return false
        Node<T> current = head; 
        
        while(current != null) {
            if(!other.find(current.getData())) {
                set.add(current.getData()); 
            }
            current = current.getNext();
        }
        
        return set;
    }
    
    /**
     * This function will create new Sorted Set that is the Complement of A
     * 
     * U = {"Jack", "John", "Marry", "Peter", "Smith}
     * A = {"John", "Marry", "Smith"} 
     * 
     * A` = {"Jack", "Peter"}
     * 
     * // Another features of testing
     * n(A) + n(A`) = n(U)
     * 
     * @param other
     * @return 
     */
    public SortedSet<T> complement(SortedSet<T> other) {
        
        // create new set
        SortedSet<T> set = new SortedSet<>();
        
        // we loop current set, if any common element return false
        Node<T> current = head; 
        
        while(current != null) {
            if(!other.find(current.getData())) {
                set.add(current.getData()); 
            }
            current = current.getNext();
        }
        
        return set; 
    }
    
    /**
     * Function to check that if two given sets are Disjoint. 
     * 
     * A = {1, 3, 5}
     * B = {2, 4, 6}
     * 
     * These two are disjoint because no element is common
     * 
     * @param other set
     * @return true if disjoint otherwise false
     */
    public boolean isDisjoint(SortedSet<T> other) {
        
        // we loop current set, if any common element return false
        Node<T> current = head; 
        
        while(current != null) {
            if(other.find(current.getData())) {
                return false; 
            }
            current = current.getNext();
        }
        
        return true; // these are disjoint sets. 
    }
    
    /**
     * Function to check that a give set is a proper subset of other set. 
     * 
     * A = {1, 2, 3, 4, 5, 6}   // A == C
     * B = {2, 3, 4}   /// Subset but also Proper Subset B != A
     * C = {1, 2, 3, 4, 5, 6}  // Subset but not Proper Subset  C == A
     * 
     * @param other set
     * @return true if other set is proper subset
     */
    public boolean isProperSubset(SortedSet<T> other) {
        
        //loop other set and check all elements in current set
        Node<T> current = other.head; 
        
        while(current != null) {
            
            // if element not common, we return false
            if(!find(current.getData())) {
                return false; 
            }
            
            current = current.getNext();
        }
        
        // reach here - all elements of other set are in current set
        
        // condition of equality
        if(size() == other.size()) {
            return false; // it is not proper subset because other == current
        }
        
        return true; // proper subset. 
    }
    
}






























